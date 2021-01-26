![Java_8](https://img.shields.io/badge/java-v1.8-red?logo=java)
![Spring_Boot](https://img.shields.io/badge/Spring_Boot-v2.1.4-green.svg?logo=spring)
![Spring_Cloud_Security](https://img.shields.io/badge/Spring_Cloud_Security-v2.1.2-green.svg?logo=spring)
![Spring_Cloud_Security](https://img.shields.io/badge/Spring_Cloud_Oauth2-v2.1.2-green.svg?logo=spring)
![GitHub stars](https://img.shields.io/github/stars/codej99/SpringOauth2AuthorizationServer?style=social)

# Oauth2 AuthorizationServer(인증서버) 구축

### 0. 개요
- SpringBoot에서 제공하는 Oauth2 인증서버 구축 방법에 대한 실습 
- daddyprogrammer.org에서 연재 및 소스 Github 등록
    - https://daddyprogrammer.org/post/series/spring-boot-oauth2/
    
### 1. 실습 환경
- Java 8~11
- SpringBoot 2.x
- Spring Oauth2
- JPA, H2
- Intellij Community

### 2. 실습 내용
- Spring Boot Oauth2 – AuthorizationServer
    - Document
        - https://daddyprogrammer.org/post/1239/spring-oauth-authorizationserver/
    - Git
        - https://github.com/codej99/SpringOauth2AuthorizationServer
- Spring Boot Oauth2 – AuthorizationServer : DB처리, JWT 토큰 방식 적용
    - Document
        - https://daddyprogrammer.org/post/1287/spring-oauth2-authorizationserver-database/
    - Git
        - https://github.com/codej99/SpringOauth2AuthorizationServer

### Oauth2 Authorize Code 실습
- http://localhost:8081/oauth/authorize?client_id=testClientId&redirect_uri=http://localhost:8081/oauth2/callback&response_type=code&scope=read

### 토큰 발급
curl -X POST 
'http://localhost:8080/oauth/token' 
-H 'Authorization:Basic dGVzdENsaWVudElkOnRlc3RTZWNyZXQ=' 
-d 'grant_type=authorization_code' 
-d 'code=9THJxB' 
-d 'redirect_uri=http://localhost:8080/oauth2/callback'

### 클라이언트 등록
insert into oauth_client_details(client_id, resource_ids,client_secret,scope,authorized_grant_types,web_server_redirect_uri,authorities,access_token_validity,refresh_token_validity,additional_information,autoapprove) values('testClientId',null,'{bcrypt}$2a$10$H2oQgFY7qCRHWqkvAV4P6ONy2v74wfr3fQv.xERw3BJYSqh/Gcgrq','read,write','authorization_code,refresh_token','http://localhost:8081/oauth2/callback','ROLE_USER',36000,50000,null,null);
       