package com.example.informationsecurity.service.impl;

import com.example.informationsecurity.entity.NodeEntity;
import com.example.informationsecurity.repository.NodeRepository;
import com.example.informationsecurity.service.NodeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeServiceImpl implements NodeService {

    @Autowired
    private NodeRepository nodeRepository;

    @Override
    public NodeEntity save(NodeEntity nodeEntity) {
        return nodeRepository.save(nodeEntity);
    }

    @Override
    public void update(NodeEntity nodeEntity) {
        nodeRepository.save(nodeEntity);
    }

    @Override
    public List<NodeEntity> getAll() {
        return nodeRepository.findAll();
    }

    @Override
    public NodeEntity getOneById(Long id) {
        return nodeRepository.findOneById(id);
    }

    @Override
    public void deleteById(Long id) {
        nodeRepository.deleteById(id);
    }
}
