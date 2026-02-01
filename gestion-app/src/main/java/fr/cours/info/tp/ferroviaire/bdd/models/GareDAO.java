package fr.cours.info.tp.ferroviaire.bdd.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "gare")
public class GareDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nom;
    private int nombreQuais;

    public GareDAO() {
    }

    public GareDAO(String nom, int nombreQuais) {
        this.nom = nom;
        this.nombreQuais = nombreQuais;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreQuais() {
        return nombreQuais;
    }

    public void setNombreQuais(int nombreQuais) {
        this.nombreQuais = nombreQuais;
    }
}
