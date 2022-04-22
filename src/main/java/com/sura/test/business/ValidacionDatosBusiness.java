package com.sura.test.business;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sura.test.client.ValidacionDatosClient;
import com.sura.test.model.CatalogosRequest;
import com.sura.test.model.ConsultarCatalogos;
import com.sura.test.model.VersionCatalogos;
import com.sura.test.service.ValidacionDatosBusinessService;
import com.sura.test.util.ApiValues;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ValidacionDatosBusiness implements ValidacionDatosBusinessService{

	@Autowired
	private ValidacionDatosClient client;
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private ApiValues values;
	
	@Override
	public void validacionDatosSOAP(String strToken, String strHash) {
		
		List<String> list = new ArrayList<>();
		list.add(values.getCatalogo());
		client.getValidacionDatos(ConsultarCatalogos.builder()
				.catalogosRequest(CatalogosRequest.builder()
						.strHash(strHash)
						.strIp(values.getIp())
						.strToken(strToken)
						.idNegocio(values.getNegocio())
						.lstCatalogo(list).build()).build());
	}

	@Override
	public void validacionDatosREST(String strToken, String strHash) {
		VersionCatalogos catalogos = new VersionCatalogos(values.getIp(), strToken, strHash);
		
		String result = template.postForObject(values.getRestUrl(), catalogos, String.class);
		
		
		log.info("===================================Resultado REST===================================");
		log.info(result);	
		log.info("===================================Fin REST===================================");
	}

}
