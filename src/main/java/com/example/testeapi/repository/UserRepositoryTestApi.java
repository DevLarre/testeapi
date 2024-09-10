package com.example.testeapi.repository;

import com.example.testeapi.model.TesteApiUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryTestApi extends JpaRepository<TesteApiUser, Long> {
}