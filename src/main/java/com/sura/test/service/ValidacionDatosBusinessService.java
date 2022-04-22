package com.sura.test.service;

public interface ValidacionDatosBusinessService {
	void validacionDatosSOAP(String strToken, String strHash);
	void validacionDatosREST(String strToken, String strHash);
}
