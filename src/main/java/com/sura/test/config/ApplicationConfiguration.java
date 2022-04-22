package com.sura.test.config;

import java.net.URL;
import java.util.Objects;

import javax.xml.ws.BindingProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.sura.test.proxy.ValidacionDatos;
import com.sura.test.proxy.ValidacionDatosService;
import com.sura.test.util.ApiValues;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class ApplicationConfiguration {
	
	@Autowired
	private ApiValues values;

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public ValidacionDatos validacionDatos() {
		ValidacionDatosService validacionDatosService = null;
		ValidacionDatos validacion = null;
		
		try {
			validacionDatosService = new ValidacionDatosService(new URL(values.getSoapUrl())) ;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(Objects.nonNull(validacionDatosService)) {
			validacion = validacionDatosService.getValidacionDatos();
		      ((BindingProvider) validacion).getRequestContext()
		          .put("com.sun.xml.internal.ws.connect.timeout",1500000);
		      ((BindingProvider) validacion).getRequestContext().put("com.sun.xml.internal.ws.connect.timeout",
		    		  1500000);
		}
		
		return validacion;
	}
}
