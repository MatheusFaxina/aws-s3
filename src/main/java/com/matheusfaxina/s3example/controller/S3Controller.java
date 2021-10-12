package com.matheusfaxina.s3example.controller;

import com.matheusfaxina.s3example.dto.PictureDTO;
import com.matheusfaxina.s3example.dto.PictureReturnDTO;
import com.matheusfaxina.s3example.service.S3Service;
import com.matheusfaxina.s3example.vault.Credentials;
import com.matheusfaxina.s3example.vault.Teste;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URISyntaxException;
import java.util.Map;

@RestController
public class S3Controller {

    private final S3Service s3Service;
    private final Teste teste;

    public S3Controller(final S3Service s3Service, final Teste teste) {
        this.s3Service = s3Service;
        this.teste = teste;
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void savePicture(@Valid PictureDTO pictureDTO) {
        s3Service.saveFile(pictureDTO);
    }

    @DeleteMapping("/{nameFile}")
    public void deletePicture(@PathVariable final String nameFile) {
        s3Service.deleteFile(nameFile);
    }

    @GetMapping("/{nameFile}")
    public PictureReturnDTO getPicture(@PathVariable final String nameFile) {
        return s3Service.getFile(nameFile);
    }

    @GetMapping("/vault")
    public Credentials teste() throws URISyntaxException {
        teste.write();
        return teste.read();
    }

}
