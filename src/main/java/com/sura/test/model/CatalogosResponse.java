package com.sura.test.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
@Getter
@Setter
public class CatalogosResponse {

	@XmlElement
	protected Integer codigo;
	
	@XmlElement
	protected String mensaje;
	
	@XmlElement
	Integer codigoRespuesta;
	@XmlElement
	Integer idNegocio;
	
	@XmlElement
	protected LstClaveCatalogoVO lstClaveCatalogoVO;
}
