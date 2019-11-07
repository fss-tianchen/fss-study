package com.bawei.myTest;

public class StringUtils {

	
	public static boolean notNull(String src) {
		return (src == null)||(src.trim().equals(""));
	}
}
