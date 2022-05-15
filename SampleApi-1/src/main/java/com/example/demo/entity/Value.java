package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Valueエンティティ
@Data
@NoArgsConstructor
@AllArgsConstructor
//このタイプに一致しないプロパティは無視する
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
	public String content;
	public Integer number;
	public List<String> names;
}
