package com.example.informationsecurity.service.impl;

import com.example.informationsecurity.entity.UserEntity;
import com.example.informationsecurity.repository.UserRepository;
import com.example.informationsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity save(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public void update(UserEntity user) {
        userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Boolean isExistUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public UserEntity findOneByUsernameAndAndPassword(String username, String password) {
        return userRepository.findOneByUsernameAndAndPassword(username, password);
    }

    @Override
    public Optional<UserEntity> findOneById(Long id) {
        return userRepository.findById(id);
    }
}
