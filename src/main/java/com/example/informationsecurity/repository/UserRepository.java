package com.example.informationsecurity.repository;

import com.example.informationsecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Boolean existsByUsername(String username);

    UserEntity save(UserEntity user);

    UserEntity findOneByUsernameAndAndPassword(String username, String password);

}
