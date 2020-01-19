package com.nicehancy.raid;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务启动类
 */
@Slf4j
@SpringBootApplication
public class RaidApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaidApplication.class, args);
		log.info("服务已启动...");
	}
}