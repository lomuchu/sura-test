package com.sura.test.model;

import java.util.List;

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
public class LstClaveCatalogoVO {

	@XmlElement
	protected String claveCatalogo;
	
	@XmlElement
	protected List<LstCatalogoVO> lstCatalogoVO;
}
