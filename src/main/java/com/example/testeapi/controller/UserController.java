package com.example.testeapi.controller;

import com.example.testeapi.model.TesteApiUser;
import com.example.testeapi.repository.UserRepositoryTestApi;
import com.example.testeapi.service.UserTestApiService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private UserTestApiService userTestApiService;

    @GetMapping("/get-user/randomuser")
    public ResponseEntity<TesteApiUser> getAndSaveUser() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://randomuser.me/api/";

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        JSONObject json = new JSONObject(response.getBody());
        JSONObject userJson = json.getJSONArray("results").getJSONObject(0);

        TesteApiUser user = new TesteApiUser();
        user.setGender(userJson.getString("gender"));
        user.setName(userJson.getJSONObject("name").getString("first") + " " + userJson.getJSONObject("name").getString("last"));
        user.setCity(userJson.getJSONObject("location").getString("city"));
        user.setState(userJson.getJSONObject("location").getString("state"));
        user.setCountry(userJson.getJSONObject("location").getString("country"));
        user.setEmail(userJson.getString("email"));
        user.setUsername(userJson.getJSONObject("login").getString("username"));
        //user.setPassword(userJson.getString("password")); Essa informação aqui eu ocultei pois não preciso saber a senha do usuário.
        user.setDateOfBirth(userJson.getJSONObject("dob").getString("date").split("T")[0]);
        user.setAge(userJson.getJSONObject("dob").getInt("age"));
        user.setAgeRegistred(userJson.getJSONObject("registered").getInt("age"));
        user.setCell(userJson.getString("cell"));
        user.setPicturePerson(userJson.getJSONObject("picture").getString("large"));

        userTestApiService.saveUser(user);

        return ResponseEntity.ok(user);
    }
}
