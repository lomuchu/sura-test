package com.sura.test.proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.sura.test.model.ConsultarCatalogos;
import com.sura.test.model.ConsultarCatalogosResponse;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@XmlRegistry
public class ObjectFactory {

	  private static final QName _Msj23_QNAME =
	      new QName("http://ws.buc.datos.valida.sura.mx.com/", "ConsultarCatalogos");


	  private static final QName _Msj23Response_QNAME =
	      new QName("http://ws.buc.datos.valida.sura.mx.com/","ConsultarCatalogosResponse");

	  public JAXBElement<ConsultarCatalogos> createMsj23(ConsultarCatalogos value) {
	    return new JAXBElement<>(_Msj23_QNAME, ConsultarCatalogos.class, null, value);
	  }

	
	  public JAXBElement<ConsultarCatalogosResponse> createMsj23Response(ConsultarCatalogosResponse value) {
	    return new JAXBElement<>(_Msj23Response_QNAME, ConsultarCatalogosResponse.class, null, value);
	  }
}
