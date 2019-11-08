package com.bawei.myTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	/**
	 * 
	 * @Title: isMobile 
	 * @Description: 验证手机号码
	 * @return
	 * @return: boolean
	 */
	public static boolean isMobile(String str) {
		String regex="^([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*)$";
		Pattern p=Pattern.compile(regex);
		Matcher matcher=p.matcher(str);
		return matcher.find();
	}
}
