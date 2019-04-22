package com.rest.oauth2.controller.common;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@RestController
@RequestMapping("/oauth2")
public class Oauth2Controller {

    private final Gson gson;

    private final RestTemplate restTemplate;

    @GetMapping(value = "/callback")
    public String callbackSocial(@RequestParam String code) {

//        String credentials = clientId + ":" + secret;
//        String encodedCredentials = new String(Base64.encodeBase64(credentials.getBytes()));
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//        headers.add("Authorization", "Basic " + encodedCredentials);
//
//        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//        params.add("code", code);
//        params.add("grant_type", grantType);
//        params.add("redirect_uri", callback);
//        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(params, headers);
//        ResponseEntity<String> response = restTemplate.postForEntity(tokenUrl, request, String.class);
//        if (response.getStatusCode() == HttpStatus.OK) {
//            return gson.fromJson(response.getBody(), OAuthToken.class);
//        }
        return code;
    }
}
