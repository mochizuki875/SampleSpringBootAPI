package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Responseエンティティ
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
	public Integer id;
	public Value value;
}
