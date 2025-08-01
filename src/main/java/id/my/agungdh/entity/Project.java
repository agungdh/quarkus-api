package id.my.agungdh.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Project extends PanacheEntity {
    public String name;
    public LocalDate createdAt;
    public String description;
}