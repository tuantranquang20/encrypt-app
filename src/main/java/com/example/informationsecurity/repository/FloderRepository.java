package com.example.informationsecurity.repository;

import com.example.informationsecurity.entity.FloderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FloderRepository extends JpaRepository<FloderEntity, Long> {

    FloderEntity save(FloderEntity nodeEntity);

    List<FloderEntity> findAll();

    FloderEntity findOneById(Long id);

    void deleteById(Long id);
}
