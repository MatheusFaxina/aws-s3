package com.matheusfaxina.s3example.model;

import lombok.Builder;
import lombok.Data;

import java.io.InputStream;

@Builder
@Data
public class Picture {

    private String nameFile;
    private InputStream inputStream;

}
