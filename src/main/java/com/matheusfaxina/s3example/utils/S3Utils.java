package com.matheusfaxina.s3example.utils;

import com.amazonaws.services.s3.model.ObjectMetadata;
import com.matheusfaxina.s3example.configuration.S3Properties;
import com.matheusfaxina.s3example.dto.PictureDTO;
import com.matheusfaxina.s3example.model.Picture;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public class S3Utils {

    public static String getPathFile(final String nameFile, final S3Properties s3Properties) {
        return String.format("%s/%s", s3Properties.getPathPictures(), nameFile);
    }

    public static ObjectMetadata getObjectMetadata(final PictureDTO pictureDTO) {
        var objectMetadata = new ObjectMetadata();
        objectMetadata.setContentType(pictureDTO.getFile().getContentType());
        return objectMetadata;
    }

    public static Picture generatePicture(final PictureDTO pictureDTO) throws IOException {
        MultipartFile pictureInputFile = pictureDTO.getFile();

        return Picture.builder()
                .nameFile(pictureDTO.getNameFile())
                .inputStream(pictureInputFile.getInputStream())
                .build();
    }

}
