package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Response;
import com.example.demo.entity.Value;

// REST APIを示すアノテーション（戻り値がViewではなくJson/XML）
@RestController
public class RandomController {
		
	@GetMapping("/api/random")
	public Response returnRandom() {
		
		// 初期化
		Response response = new Response();
		Value value = new Value((long) 10, "Really loving Spring Boot, makes stand alone Spring apps easy.");
		response.type = "success";
		response.value = value;
		
		return response; // インスタンスの属性がJSON形式でレスポンスになる
	}

}
