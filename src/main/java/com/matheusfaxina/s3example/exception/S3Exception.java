package com.matheusfaxina.s3example.exception;

public class S3Exception extends RuntimeException {

    public S3Exception(String message, Exception cause) {
        super(message, cause);
    }

    public S3Exception(String message) {
        super(message);
    }

}
