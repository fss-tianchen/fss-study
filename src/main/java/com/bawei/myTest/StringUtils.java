package com.bawei.myTest;

public class StringUtils {

	
	public static boolean notNull(String src) {
		return (src == null)||(src.trim().equals(""));
	}
	
	/**
	 * @Title: haveValue 
	 * @Description: 判断是否有值
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean haveValue(String str) {
		return !(str==null||str.trim().equals(""));
	}
}
