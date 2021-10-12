package com.matheusfaxina.s3example.service;

import com.matheusfaxina.s3example.dto.PictureDTO;
import com.matheusfaxina.s3example.dto.PictureReturnDTO;

public interface S3Service {

    PictureReturnDTO getFile(final String nameFile);
    void saveFile(final PictureDTO pictureDTO);
    void deleteFile(final String nameFile);

}
