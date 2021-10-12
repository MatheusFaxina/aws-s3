package com.matheusfaxina.s3example.dto;

import com.matheusfaxina.s3example.validation.FileContentType;
import com.matheusfaxina.s3example.validation.FileSize;
import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class PictureDTO {

    @NotNull
    @FileSize(max = "500KB")
    @FileContentType(allowed = { MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE })
    private MultipartFile file;

    @NotBlank
    private String nameFile;

}
