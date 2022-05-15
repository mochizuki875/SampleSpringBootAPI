package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Valueエンティティ
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Value {
	public Long id;
	public String quote;
	
}
