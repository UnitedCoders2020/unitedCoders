package com.testing.Parabank.Utils;

import java.util.Date;

public class DateUtils {
	
	static Date date = new Date();
	
	public static String getTimeStamp(){
		
		return date.toString().replaceAll(":", "_");
	}

	public static String username() {
		
        long l= date.getTime();
        return String.valueOf(l);
        
	}
}
