package com.example.informationsecurity.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_floder")
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FloderEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column
    private String floderName;

    @Override
    public String toString() {
        return "FloderEntity{" +
                "id=" + id +
                ", floderName='" + floderName + '\'' +
                '}';
    }
}
