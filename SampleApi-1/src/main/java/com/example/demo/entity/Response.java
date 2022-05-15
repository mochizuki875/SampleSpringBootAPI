package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Responseエンティティ
@Data
@NoArgsConstructor
@AllArgsConstructor
//このタイプに一致しないプロパティは無視する
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
	public Integer id;
	public Value value;
}
