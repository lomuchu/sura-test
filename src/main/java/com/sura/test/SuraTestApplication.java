package com.sura.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.sura.test.components.ExecuteApis;
import com.sura.test.model.DataModel;

import lombok.extern.slf4j.Slf4j;

@ComponentScan(basePackages = {"com.sura.test.*"})
@SpringBootApplication
@EnableAutoConfiguration
@Slf4j
public class SuraTestApplication implements CommandLineRunner{

	@Autowired
	private ExecuteApis ex;
	
	public static void main(String[] args) {
		SpringApplication.run(SuraTestApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
//		log.info(args[0]);
		if(args.length == 2) {
			ex.exect(new DataModel(null, args[0], args[1]));
		} else {
			ex.exect();
		}
	}


}
