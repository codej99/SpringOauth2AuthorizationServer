# SpringOauth2AuthorizationServer
Spring Oauth2 AuthorizationServer



## Oauth2 Authorize
http://localhost:8081/oauth/authorize?client_id=testClientId&redirect_uri=http://localhost:8081/oauth2/callback&response_type=code&scope=read

## publish token
curl -X POST \
'http://localhost:8080/oauth/token' \
-H 'Authorization:Basic dGVzdENsaWVudElkOnRlc3RTZWNyZXQ=' \
-d 'grant_type=authorization_code' \
-d 'code=9THJxB' \
-d 'redirect_uri=http://localhost:8080/oauth2/callback'

## add client

insert into oauth_client_details(client_id, resource_ids,client_secret,scope,authorized_grant_types,web_server_redirect_uri,authorities,access_token_validity,refresh_token_validity,additional_information,autoapprove)
values('testClientId',null,'{bcrypt}$2a$10$H2oQgFY7qCRHWqkvAV4P6ONy2v74wfr3fQv.xERw3BJYSqh/Gcgrq','read,write','authorization_code','http://localhost:8081/oauth2/callback','ROLE_USER',36000,50000,null,null);
