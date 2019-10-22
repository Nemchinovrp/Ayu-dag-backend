package ru.ayu_dag.backend.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String location;
}
