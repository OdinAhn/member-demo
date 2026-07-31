package com.memberdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.DefaultCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.presigner.S3Presigner;

@Configuration
public class S3Config {

    @Value("${cloud.aws.region.static:ap-northeast-2}")
    private String region;

    // S3 일반 조작(파일 업로드/삭제 등)을 위한 Client
    @Bean
    public S3Client s3Client() {
        return S3Client.builder()
                .region(Region.of(region))
                // DefaultCredentialsProvider가 자동으로 EC2 IAM Role을 읽어옵니다!
                .build();
    }

    // Presigned URL 생성을 위한 Presigner
    @Bean
    public S3Presigner s3Presigner() {
        return S3Presigner.builder()
                .region(Region.of(region))
                .credentialsProvider(DefaultCredentialsProvider.create())
                .build();
    }
}