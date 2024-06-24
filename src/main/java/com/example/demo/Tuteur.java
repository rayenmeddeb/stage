package com.example.demo;

import java.util.Set;

import org.apache.catalina.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Tuteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;

    @OneToOne
    @JoinColumn(name = "user_id")
    private user user;
    
    @OneToMany(mappedBy = "tuteur")
    private Set<stagiaire> stagiaires;
    

    @ManyToOne
    @JoinColumn(name = "departement_id")
    private Departement departement;
    
    
    
    
}