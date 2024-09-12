package com.example.testeapi.controller;

import com.example.testeapi.model.TesteApiUser;
import com.example.testeapi.repository.UserRepositoryTestApi;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserRepositoryTestApi userRepositoryTestApi;

    @Test
    public void testGetAndSaveUser() throws Exception {
        mockMvc.perform(get("/get-user/randomuser")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").exists())
                .andExpect(jsonPath("$.email").exists());

        // Verifica se o usuário foi salvo no banco de dados
        Iterable<TesteApiUser> users = userRepositoryTestApi.findAll();
        assert users.iterator().hasNext();
    }
}
