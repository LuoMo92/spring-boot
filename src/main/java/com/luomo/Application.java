package com.luomo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//启用定时任务的配置
@EnableScheduling
//启用异步调用
@EnableAsync
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public DataLoader dataLoader(){
		return new DataLoader();
	}

	@Slf4j
	static class DataLoader implements CommandLineRunner{
		@Override
		public void run(String... strings) throws Exception {
			log.info("Loading data......");
		}
	}
}
