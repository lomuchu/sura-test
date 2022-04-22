package com.sura.test.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sura.test.model.DataModel;
import com.sura.test.service.ValidacionDatosBusinessService;
import com.sura.test.util.DataGenerator;
import com.sura.test.util.DateUtil;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ExecuteApis {
	
	@Autowired
	private ValidacionDatosBusinessService service;

	
	@Autowired
	private DataGenerator generator;
	
	public void exect() {
		String dia = DateUtil.getStrDate();
		DataModel model = generator.getByDia(dia);
		if(model != null) {
			
		exect(model);
		}
	}
	
	
	public void exect(DataModel model) {
			
			execSOAP(model);
			execRest(model);
		
	}
	
	private void  execSOAP(DataModel model) {
		service.validacionDatosSOAP(model.getToken(), model.getHash());
	}
	
	private void execRest(DataModel model) {
		service.validacionDatosREST(model.getToken(), model.getHash());
	}
}
