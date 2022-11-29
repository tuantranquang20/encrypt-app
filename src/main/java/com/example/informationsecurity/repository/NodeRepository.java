package com.example.informationsecurity.repository;

import com.example.informationsecurity.entity.NodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NodeRepository extends JpaRepository<NodeEntity, Long> {

    NodeEntity save(NodeEntity nodeEntity);

    List<NodeEntity> findAll();

    NodeEntity findOneById(Long id);

    void deleteById(Long id);
}
