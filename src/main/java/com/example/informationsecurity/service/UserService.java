package com.example.informationsecurity.service;

import com.example.informationsecurity.entity.UserEntity;
import org.apache.catalina.User;

import java.util.Optional;

public interface UserService {

    UserEntity save(UserEntity user);

    void update(UserEntity user);

    void deleteById(Long id);

    Boolean isExistUsername(String username);

    UserEntity findOneByUsernameAndAndPassword(String username, String password);

    Optional<UserEntity> findOneById(Long id);
}
