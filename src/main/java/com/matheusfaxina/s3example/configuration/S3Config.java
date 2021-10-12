package com.matheusfaxina.s3example.configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class S3Config {

    private final S3Properties s3Properties;

    public S3Config(final S3Properties s3Properties) {
        this.s3Properties = s3Properties;
    }

    @Bean
    public AmazonS3 amazonS3() {
        var credentials = new BasicAWSCredentials(
                s3Properties.getAccessKey(),
                s3Properties.getSecretKey()
        );

        return AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(s3Properties.getRegion())
                .build();
    }

}
