package com.example.informationsecurity.service;

import com.example.informationsecurity.entity.NodeEntity;

import java.util.List;

public interface NodeService {

    NodeEntity save(NodeEntity nodeEntity);

    void update(NodeEntity nodeEntity);

    List<NodeEntity> getAll();

    NodeEntity getOneById(Long id);

    void deleteById(Long id);

}
