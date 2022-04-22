package com.sura.test.proxy;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.sura.test.model.CatalogosRequest;
import com.sura.test.model.CatalogosResponse;

@WebService
@XmlSeeAlso({ObjectFactory.class})
public interface ValidacionDatos {

	@WebMethod(operationName = "consultarCatalogos")
	@RequestWrapper(localName = "consultarCatalogos",
					targetNamespace = "http://ws.buc.datos.valida.sura.mx.com/",
					className = "com.sura.test.model.ConsultarCatalogos")
	 @ResponseWrapper(localName = "consultarCatalogosResponse",
     targetNamespace = "http://ws.buc.datos.valida.sura.mx.com/",
     className = "com.sura.test.model.ConsultarCatalogosResponse")
	void consultarCatalogos(@WebParam(name = "catalogosRequest") CatalogosRequest request,
			@WebParam(name = "catalogosResponse",
			mode = WebParam.Mode.OUT) Holder<CatalogosResponse> catalogoResponse);
}
