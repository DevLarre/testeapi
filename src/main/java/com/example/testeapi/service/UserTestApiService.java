package com.example.testeapi.service;

import com.example.testeapi.model.TesteApiUser;
import com.example.testeapi.repository.UserRepositoryTestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTestApiService {

    @Autowired
    private UserRepositoryTestApi userRepositoryTestApi;

    public void saveUser(TesteApiUser testeApiUser) {
        userRepositoryTestApi.save(testeApiUser);
    }
}
