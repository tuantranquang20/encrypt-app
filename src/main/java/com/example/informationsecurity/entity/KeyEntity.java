package com.example.informationsecurity.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_key")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long nodeId;

    @Column
    private Long userId;

    @Column
    private String keyContent;

    @Override
    public String toString() {
        return "KeyEntity{" +
                "id=" + id +
                ", nodeId=" + nodeId +
                ", userId=" + userId +
                ", key='" + keyContent + '\'' +
                '}';
    }
}
