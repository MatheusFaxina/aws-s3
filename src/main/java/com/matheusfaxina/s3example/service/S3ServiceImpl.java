package com.matheusfaxina.s3example.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.*;
import com.matheusfaxina.s3example.configuration.S3Properties;
import com.matheusfaxina.s3example.dto.PictureDTO;
import com.matheusfaxina.s3example.dto.PictureReturnDTO;
import com.matheusfaxina.s3example.exception.S3Exception;
import com.matheusfaxina.s3example.model.Picture;
import org.springframework.stereotype.Service;

import static com.matheusfaxina.s3example.utils.S3Utils.*;

@Service
public class S3ServiceImpl implements S3Service {

    private final S3Properties s3Properties;
    private final AmazonS3 amazonS3;

    public S3ServiceImpl(final S3Properties s3Properties, final AmazonS3 amazonS3) {
        this.s3Properties = s3Properties;
        this.amazonS3 = amazonS3;
    }

    @Override
    public PictureReturnDTO getFile(final String nameFile) {
        return PictureReturnDTO.builder()
                .url(amazonS3.getUrl(s3Properties.getBucket(), getPathFile(nameFile, s3Properties)).toString())
                .build();
    }

    @Override
    public void saveFile(final PictureDTO pictureDTO) {
        try {
            Picture picture = generatePicture(pictureDTO);

            var putObjectRequest = new PutObjectRequest(
                    s3Properties.getBucket(),
                    getPathFile(picture.getNameFile(), s3Properties),
                    picture.getInputStream(),
                    getObjectMetadata(pictureDTO)
            )
                    .withCannedAcl(CannedAccessControlList.PublicRead);

            amazonS3.putObject(putObjectRequest);
        } catch (Exception e) {
            throw new S3Exception("Error sending image to Amazon S3", e);
        }
    }

    @Override
    public void deleteFile(final String nameFile) {
        try {
            var deleteObjectRequest = new DeleteObjectRequest(s3Properties.getBucket(), getPathFile(nameFile, s3Properties));

            amazonS3.deleteObject(deleteObjectRequest);
        } catch (Exception e) {
            throw new S3Exception("Error deleting image to Amazon S3", e);
        }
    }

}
