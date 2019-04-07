package com.expresstracking.entity;

public class CodeNamePair {

	/**
	 * 地区编码
	 */
	private String code;
	private String name;
	
	public CodeNamePair(){}
	
	public CodeNamePair(String code, String name){
		code = code;
		name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}