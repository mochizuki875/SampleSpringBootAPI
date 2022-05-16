# Sample Spring Boot API

## Quick Start

実行
```
./gradlew bootRun
```

リクエスト
```
/api1?num={num}

num=1: sleep
num=2: 502 Error
num=*: 通常処理
```

## Reference

REST API の作成  
https://spring.pleiades.io/guides/gs/rest-service/

RestTemplate で REST API の利用  
https://spring.pleiades.io/guides/gs/consuming-rest/