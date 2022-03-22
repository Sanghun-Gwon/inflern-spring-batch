package com.example.inflearnbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
// 스프링 배치가 작동하기 위해 선언해야 하는 어노테이션
//      4개의 설정 클래스를 실행시키며 스프링 배치의 모든 초기화 및 실행 구성이 이루어짐(BatchAutoConfiguration, SimpleBatchConfiguration, BatchConfigurerConfiguration)
//      스프링 부트 배치의 자동 설정 클래스가 실행됨으로 빈으로 등록된 모든 잡을 검색해서 초기화와 동시해 잡을 수행하도록 구성
public class InflearnBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(InflearnBatchApplication.class, args);
    }

}
