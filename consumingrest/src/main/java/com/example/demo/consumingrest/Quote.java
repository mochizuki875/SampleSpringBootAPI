package com.example.demo.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// このタイプに一致しないプロパティは無視する
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	private String type;
	private Value value;
	
	public Quote() {
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Value getValue() {
		return value;
	}
	
	public void setValue(Value value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Quote{" +
		        "type='" + type + '\'' +
		        ", value=" + value +
		        '}';
	}
}
