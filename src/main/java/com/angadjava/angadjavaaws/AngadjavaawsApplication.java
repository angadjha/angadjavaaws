package com.angadjava.angadjavaaws;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AngadjavaawsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngadjavaawsApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(@Value("${my-first-key}") String firstKey){
		return args -> {
			System.out.println("My First key value:"+firstKey);
		};
	}

}
