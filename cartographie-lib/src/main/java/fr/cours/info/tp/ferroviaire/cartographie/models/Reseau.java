package fr.cours.info.tp.ferroviaire.cartographie.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un réseau ferroviaire composé de gares et de chemins de fer.
 */
public class Reseau {
    
    private String nom;
    private List<Gare> gares;
    private List<CheminDeFer> cheminsDeFer;

    public Reseau() {
        this.gares = new ArrayList<>();
        this.cheminsDeFer = new ArrayList<>();
    }

    public Reseau(String nom) {
        this.nom = nom;
        this.gares = new ArrayList<>();
        this.cheminsDeFer = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Gare> getGares() {
        return gares;
    }

    public void setGares(List<Gare> gares) {
        this.gares = gares;
    }

    public List<CheminDeFer> getCheminsDeFer() {
        return cheminsDeFer;
    }

    public void setCheminsDeFer(List<CheminDeFer> cheminsDeFer) {
        this.cheminsDeFer = cheminsDeFer;
    }

    /**
     * Ajoute une gare au réseau.
     * @param gare la gare à ajouter
     */
    public void ajouterGare(Gare gare) {
        this.gares.add(gare);
    }

    /**
     * Crée un chemin de fer entre deux gares.
     * @param gareDepart nom de la gare de départ
     * @param gareArrivee nom de la gare d'arrivée
     * @return le chemin de fer créé
     */
    public CheminDeFer creerChemin(String gareDepart, String gareArrivee) {
        CheminDeFer chemin = new CheminDeFer();
        chemin.setNDepart(gareDepart);
        chemin.setId(gareDepart + "-" + gareArrivee);
        this.cheminsDeFer.add(chemin);
        return chemin;
    }

    /**
     * Supprime une gare du réseau.
     * @param gare la gare à supprimer
     */
    public void supprimerGare(Gare gare) {
        this.gares.remove(gare);
    }

    /**
     * Recherche une gare par son nom.
     * @param nom le nom de la gare
     * @return la gare trouvée ou null
     */
    public Gare rechercherGare(String nom) {
        return gares.stream()
                .filter(g -> g.getNom().equals(nom))
                .findFirst()
                .orElse(null);
    }
}
