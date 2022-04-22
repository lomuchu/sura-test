package com.sura.test.client;

import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sura.test.model.CatalogosResponse;
import com.sura.test.model.ConsultarCatalogos;
import com.sura.test.model.LstCatalogoVO;
import com.sura.test.proxy.ValidacionDatos;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ValidacionDatosClient {

	@Autowired
	private ValidacionDatos validacionDatos;
	
	public void getValidacionDatos(ConsultarCatalogos request) {
		Holder<CatalogosResponse> resultado = new Holder<>();
		
		try {
			validacionDatos.consultarCatalogos(request.getCatalogosRequest(), resultado);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	switch (resultado.value.getCodigo()) {
	      case 0:
	    	  printResult(resultado);
	        break;
	      default:
	        log.info("no se encontro nada");
	    }
	}
	
	
	private void printResult(Holder<CatalogosResponse> resultado ) {
		  log.info("===================================Resultado SOAP===================================");
	  		log.info("Codigo: "+ resultado.value.getCodigo());	
	  		log.info("Mensaje: "+ resultado.value.getMensaje());	
	  		log.info("Clave Catalogo: "+ resultado.value.getLstClaveCatalogoVO().getClaveCatalogo());	
	  		for(LstCatalogoVO lista: resultado.value.getLstClaveCatalogoVO().getLstCatalogoVO()) {
	  			log.info("descripcion: "+lista.getDescripcion());
	  			log.info("idBuc: "+lista.getIdBuc());
	  			log.info("idCatalogo: "+lista.getIdBuc());
	  		}
	  		log.info("===================================Fin SOAP===================================");
	}
}
