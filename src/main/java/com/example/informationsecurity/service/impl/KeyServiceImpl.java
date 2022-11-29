package com.example.informationsecurity.service.impl;

import com.example.informationsecurity.entity.KeyEntity;
import com.example.informationsecurity.repository.KeyRepository;
import com.example.informationsecurity.service.KeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyServiceImpl implements KeyService {

    @Autowired
    private KeyRepository keyRepository;

    @Override
    public KeyEntity save(KeyEntity FloderEntity) {
        return keyRepository.save(FloderEntity);
    }

    @Override
    public void update(KeyEntity FloderEntity) {
        keyRepository.save(FloderEntity);
    }

    @Override
    public List<KeyEntity> getAll() {
        return keyRepository.findAll();
    }

    @Override
    public KeyEntity getOneById(Long id) {
        return keyRepository.findOneById(id);
    }

    @Override
    public void deleteById(Long id) {
        keyRepository.deleteById(id);
    }
}
