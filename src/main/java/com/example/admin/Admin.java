package com.example.admin;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String position;
    private String office;
    private int age;
   
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start_date;

    private int salary;

}

