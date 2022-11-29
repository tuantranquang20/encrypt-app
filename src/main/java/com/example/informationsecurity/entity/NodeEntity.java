package com.example.informationsecurity.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_node")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nodeContent;

    @Column
    private String floderName;

    @Override
    public String toString() {
        return "NodeEntity{" +
                "id=" + id +
                ", nodeContent='" + nodeContent + '\'' +
                ", floderName='" + floderName + '\'' +
                '}';
    }
}
