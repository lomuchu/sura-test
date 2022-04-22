package com.sura.test.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class ApiValues {
	  @Value("${com.sura.rest.url}")
	  private String restUrl;
	  
	  @Value("${com.sura.soap.url}")
	  private String soapUrl;
	  
	  @Value("${com.sura.ip}")
	  private String ip;
	  
	  @Value("${com.sura.negocio}")
	  private Integer negocio;
	  
	  @Value("${com.sura.catalogo}")
	  private String catalogo;
}
