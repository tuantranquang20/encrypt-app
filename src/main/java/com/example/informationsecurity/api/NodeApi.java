package com.example.informationsecurity.api;

import com.example.informationsecurity.entity.NodeEntity;
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
public class NodeApi {

    @Autowired
    private NodeService nodeServiceImpl;

    @PostMapping("/node")
    public ResponseEntity<?> create(@RequestBody NodeEntity nodeEntity) {
        NodeEntity result = nodeServiceImpl.save(nodeEntity);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/node")
    public ResponseEntity<?> update(@RequestBody NodeEntity nodeEntity) {
        nodeServiceImpl.update(nodeEntity);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/node")
    public ResponseEntity<?> getAll() {
        List<NodeEntity> result = nodeServiceImpl.getAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/node/{id}")
    public ResponseEntity<?> getOneById(@PathVariable(name = "id") Long id) {
        NodeEntity result = nodeServiceImpl.getOneById(id);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/node")
    public ResponseEntity<?> delete(@RequestBody Long id) {
        nodeServiceImpl.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
