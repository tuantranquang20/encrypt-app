package com.example.informationsecurity.api;

import com.example.informationsecurity.entity.FloderEntity;
import com.example.informationsecurity.entity.NodeEntity;
import com.example.informationsecurity.service.FloderService;
import com.example.informationsecurity.service.NodeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FloderApi {

    @Autowired
    private FloderService floderServiceImpl;

    @PostMapping("/floder")
    public ResponseEntity<?> create(@RequestBody FloderEntity floderEntity) {
        FloderEntity result = floderServiceImpl.save(floderEntity);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/floder")
    public ResponseEntity<?> update(@RequestBody FloderEntity floderEntity) {
        floderServiceImpl.update(floderEntity);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/floder")
    public ResponseEntity<?> getAll() {
        List<FloderEntity> result = floderServiceImpl.getAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/floder/{id}")
    public ResponseEntity<?> getOneById(@PathVariable(name = "id") Long id) {
        FloderEntity result = floderServiceImpl.getOneById(id);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/floder/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        floderServiceImpl.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
