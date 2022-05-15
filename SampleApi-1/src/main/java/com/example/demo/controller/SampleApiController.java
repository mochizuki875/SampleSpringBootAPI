package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Response;

// REST APIを示すアノテーション（戻り値がViewではなくJson/XML）
@RestController
public class SampleApiController {
	
	RestTemplate restTemplate = new RestTemplate(); // RestTemplateを作成
	
	@GetMapping("/api1")
	public Response returnResponse(@RequestParam(value = "num", defaultValue = "0") Integer num) {

		String URL = "http://127.0.0.1:8082/api2/?num={num}";
		
		try {
			Response response = restTemplate.getForObject(URL, Response.class, num); // リクエスト実行
			return response; // インスタンスの属性がJSON形式でレスポンスになる
		}
		catch (HttpClientErrorException e) {
			throw e;
		}
		catch (HttpServerErrorException e) {
			throw e;
		}
	}

}
