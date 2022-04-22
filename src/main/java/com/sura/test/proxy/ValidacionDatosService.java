package com.sura.test.proxy;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

import org.springframework.beans.factory.annotation.Autowired;

import com.sura.test.util.ApiValues;

@WebServiceClient
public class ValidacionDatosService extends Service{
	


	public ValidacionDatosService(URL wsdlDocumentLocation) {
		super(wsdlDocumentLocation, new QName("http://ws.buc.datos.valida.sura.mx.com/","ValidacionDatosWSService"));
	}

	 @WebEndpoint
	 public ValidacionDatos getValidacionDatos() {
		 return super.getPort(new QName("http://ws.buc.datos.valida.sura.mx.com/","ValidacionDatosWSPort"), ValidacionDatos.class);
	 }
}
