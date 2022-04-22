package com.sura.test.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

	public static String getStrDate() {
		
		LocalDateTime dt = LocalDateTime.now();
		
		return dt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
	}
}
