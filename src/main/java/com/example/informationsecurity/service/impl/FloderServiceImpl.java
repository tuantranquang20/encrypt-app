package com.example.informationsecurity.service.impl;

import com.example.informationsecurity.entity.FloderEntity;
import com.example.informationsecurity.repository.FloderRepository;
import com.example.informationsecurity.service.FloderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloderServiceImpl implements FloderService {

    @Autowired
    private FloderRepository floderRepository;

    @Override
    public FloderEntity save(FloderEntity FloderEntity) {
        return floderRepository.save(FloderEntity);
    }

    @Override
    public void update(FloderEntity FloderEntity) {
        floderRepository.save(FloderEntity);
    }

    @Override
    public List<FloderEntity> getAll() {
        return floderRepository.findAll();
    }

    @Override
    public FloderEntity getOneById(Long id) {
        return floderRepository.findOneById(id);
    }

    @Override
    public void deleteById(Long id) {
        floderRepository.deleteById(id);
    }
}
