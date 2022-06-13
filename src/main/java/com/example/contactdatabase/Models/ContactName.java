package com.example.contactdatabase.Models;


import javax.persistence.*;

@Entity
@Table(name= "ContactNames")
public class ContactName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Long number;

    @Column(nullable = false)
    private String address;



}
