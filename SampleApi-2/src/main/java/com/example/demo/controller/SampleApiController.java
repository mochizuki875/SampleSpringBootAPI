package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.example.demo.entity.Response;
import com.example.demo.entity.Value;

// REST APIを示すアノテーション（戻り値がViewではなくJson/XML）
@RestController
public class SampleApiController {
		
	@GetMapping("/api2")
	public Response returnResponse(@RequestParam(value = "num", defaultValue = "0") Integer num) {

		// responsに含める値を作成（本来は実装した処理によって値が生成される想定）
		String message = "sample-api-2";
		Integer id = 10;
		List<String> names = new ArrayList<>();		
		names.add("Taro");
		names.add("Jiro");
		names.add("Saburo");
		// Valueインスタンスを作成
		Value value = new Value(message, id, names);  // @AllArgsConstructorにより生成されたコンストラクタを利用
		
		try {
			if(num == 1) { // num=1なら一定時間sleep
				System.out.println("sleep");
				try {
		            Thread.sleep(3000);
		        } catch(InterruptedException e){
		            e.printStackTrace();
		        }
			} else if (num == 2) { // num=2なら500エラー
				throw new HttpServerErrorException(HttpStatus.BAD_GATEWAY, "Internal Server Error");
			}
			
			// 上で作成した値を用いてResponseインスタンスを作成
			Response response = new Response(num, value); // @AllArgsConstructorにより生成されたコンストラクタを利用
			// Responseインスタンスを編集
			response.value.content = "Hello" + response.value.content; // @Dataアノテーションにより作成されるgetter/setterを利用

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
