package com.example.informationsecurity.service;

import com.example.informationsecurity.entity.KeyEntity;
import com.example.informationsecurity.entity.NodeEntity;

import java.security.Key;
import java.util.List;

public interface KeyService {

    KeyEntity save(KeyEntity keyEntity);

    void update(KeyEntity keyEntity);

    List<KeyEntity> getAll();

    KeyEntity getOneById(Long id);

    void deleteById(Long id);

}
