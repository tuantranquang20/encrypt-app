package com.example.informationsecurity.api;

import com.example.informationsecurity.entity.UserEntity;
import com.example.informationsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserApi {

    @Autowired
    private UserService userServiceImpl;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody UserEntity user) {
        if (userServiceImpl.isExistUsername(user.getUsername()))
            return ResponseEntity.badRequest().body("User already exists");
        user = userServiceImpl.save(user);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestBody UserEntity user) {
        user = userServiceImpl.findOneByUsernameAndAndPassword(user.getUsername(), user.getPassword());
        if (user == null) return ResponseEntity.badRequest().body("Login fail");
        return ResponseEntity.ok(user);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getOneById(@PathVariable(name = "id") Long id) {
        Optional<UserEntity> optional = userServiceImpl.findOneById(id);
        if (!optional.isPresent()) return ResponseEntity.badRequest().body("User not exits");
        return ResponseEntity.ok(optional.get());
    }

    @PutMapping("/user")
    public ResponseEntity<?> update(@RequestBody UserEntity user) {
        userServiceImpl.update(user);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteOneById(@PathVariable(name = "id") Long id) {
        userServiceImpl.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
