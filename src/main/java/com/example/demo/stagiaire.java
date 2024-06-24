package com.example.demo;

import java.util.Date;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class stagiaire {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	 private String nom;
	    private String prenom;
	    @Temporal(TemporalType.DATE)
	    private Date DateNai; 
	    
	    
	    @OneToOne
	    @JoinColumn(name = "user_id")
	    private user user;

	   @ManyToOne
	    @JoinColumn(name = "tuteur_id")
	    private Tuteur tuteur;
	    
	   
	    @ManyToOne
	    @JoinColumn(name = "departement_id")
	    private Departement departement;
	    
	    
	    @OneToMany(mappedBy = "stagiaire")
	    private Set<Projet> projets;
	    
	    
	    @OneToMany(mappedBy = "stagiaire")
	    private Set<Evaluation> evaluations;
}
