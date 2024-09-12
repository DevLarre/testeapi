package com.example.testeapi.service;

import com.example.testeapi.model.TesteApiUser;
import com.example.testeapi.repository.UserRepositoryTestApi;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class UserTestApiServiceTest {

    @Mock
    private UserRepositoryTestApi userRepositoryTestApi;

    @InjectMocks
    private UserTestApiService userTestApiService;

    public UserTestApiServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveUser() {
        // Criação de um mock para TesteApiUser
        TesteApiUser mockUser = new TesteApiUser();
        mockUser.setName("John Doe");

        // Chama o método que será testado
        userTestApiService.saveUser(mockUser);

        // Verifica se o método save foi chamado com o mockUser
        verify(userRepositoryTestApi, times(1)).save(mockUser);
    }
}
