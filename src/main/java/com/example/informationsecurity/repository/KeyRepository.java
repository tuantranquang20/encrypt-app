package com.example.informationsecurity.repository;

import com.example.informationsecurity.entity.KeyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KeyRepository extends JpaRepository<KeyEntity, Long> {

    KeyEntity save(KeyEntity keyEntity);

    List<KeyEntity> findAll();

    KeyEntity findOneById(Long id);

    void deleteById(Long id);
}
