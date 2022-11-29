package com.example.informationsecurity.service;

import com.example.informationsecurity.entity.FloderEntity;
import com.example.informationsecurity.entity.NodeEntity;

import java.util.List;

public interface FloderService {

    FloderEntity save(FloderEntity nodeEntity);

    void update(FloderEntity nodeEntity);

    List<FloderEntity> getAll();

    FloderEntity getOneById(Long id);

    void deleteById(Long id);

}
