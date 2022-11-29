package com.example.informationsecurity.api;

import com.example.informationsecurity.entity.FloderEntity;
import com.example.informationsecurity.entity.KeyEntity;
import com.example.informationsecurity.service.FloderService;
import com.example.informationsecurity.service.KeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class KeyApi {

    @Autowired
    private KeyService keyServiceImpl;

    @PostMapping("/key")
    public ResponseEntity<?> create(@RequestBody KeyEntity keyEntity) {
        KeyEntity result = keyServiceImpl.save(keyEntity);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/key")
    public ResponseEntity<?> update(@RequestBody KeyEntity keyEntity) {
        keyServiceImpl.update(keyEntity);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/key")
    public ResponseEntity<?> getAll() {
        List<KeyEntity> result = keyServiceImpl.getAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/key/{id}")
    public ResponseEntity<?> getOneById(@PathVariable(name = "id") Long id) {
        KeyEntity result = keyServiceImpl.getOneById(id);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/key")
    public ResponseEntity<?> delete(@RequestBody Long id) {
        keyServiceImpl.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
