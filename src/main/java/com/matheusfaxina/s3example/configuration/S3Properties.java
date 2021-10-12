package com.matheusfaxina.s3example.configuration;

import com.amazonaws.regions.Regions;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("aws-config.storage")
public class S3Properties {

    @Value("${aws-config.storage.s3.access-key}")
    private String accessKey;

    @Value("${aws-config.storage.s3.secret-key}")
    private String secretKey;

    @Value("${aws-config.storage.s3.bucket}")
    private String bucket;

    @Value("${aws-config.storage.s3.region}")
    private Regions region;

    @Value("${aws-config.storage.s3.path-pictures}")
    private String pathPictures;

}
