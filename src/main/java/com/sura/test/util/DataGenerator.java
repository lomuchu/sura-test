package com.sura.test.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sura.test.model.DataModel;

@Component
public class DataGenerator {
	
	private List<DataModel> list;
	
	public DataGenerator() {
		list = new ArrayList<>();
		
		list.add(new DataModel("21/04/2022", "MTAuMjEyLjExOC4zMCMyMS8wNC8yMDIy", "HEU8tM1PcPtTnwuoJlF4DXAALXSl1ryC3hevGuXwNKE="));
		list.add(new DataModel("22/04/2022", "MTAuMjEyLjExOC4zMCMyMS8wNC8yMDIy", "ib//ueR3LORZRnxfl9FSFNFqAUCnTgNwklf6WbHWwz8="));
		list.add(new DataModel("23/04/2022", "MTAuMjEyLjExOC4zMCMyMS8wNC8yMDIy", "ta8tkW8R5T7FxjBCIt+bPfUzgiBA5xZ6qdFfjE1MzvY="));
	}
	
	public DataModel getByDia(String dia) {
		return  list.stream().filter(item -> item.getDia().equals(dia)).findAny().orElse(null);
	}
}
