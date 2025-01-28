package org.example.spring_boot_jr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "humans", schema = "public")
@Data
public class HumanEntity {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String city;

    @Column
    private String occupation;

}
