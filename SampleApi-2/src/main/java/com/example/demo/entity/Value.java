package com.example.demo.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Valueエンティティ
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Value {
	public String content;
	public Integer number;
	public List<String> names;
}
