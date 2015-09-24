package com.sforce.soap.partner;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated by SimpleTypeCodeGenerator.java. Please do not edit.
 */
public enum WebLinkWindowType {


  
	/**
	 * Enumeration  : newWindow
	 */
	newWindow("newWindow"),

  
	/**
	 * Enumeration  : sidebar
	 */
	sidebar("sidebar"),

  
	/**
	 * Enumeration  : noSidebar
	 */
	noSidebar("noSidebar"),

  
	/**
	 * Enumeration  : replace
	 */
	replace("replace"),

  
	/**
	 * Enumeration  : onClickJavaScript
	 */
	onClickJavaScript("onClickJavaScript"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (WebLinkWindowType e : EnumSet.allOf(WebLinkWindowType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private WebLinkWindowType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
