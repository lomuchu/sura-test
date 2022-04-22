package com.sura.test.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class CatalogosRequest {

	@XmlElement
	protected Integer idAcceso;
	
	@XmlElement
	protected String ip;
	
	@XmlElement
	protected Integer port;
	
	@XmlElement
	protected String schema;
	
	@XmlElement
	protected String serverName;
	
	@XmlElement
	protected String sesion;
	
	@XmlElement
	protected String strHash;
	
	@XmlElement
	protected String strIp;
	
	@XmlElement
	protected String strToken;
	
	@XmlElement
	protected Integer idNegocio;
	
	@XmlElement
	protected List<String> lstCatalogo;
}
