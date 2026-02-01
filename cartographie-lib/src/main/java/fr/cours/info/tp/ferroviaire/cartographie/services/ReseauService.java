package fr.cours.info.tp.ferroviaire.cartographie.services;

import fr.cours.info.tp.ferroviaire.cartographie.models.CheminDeFer;
import fr.cours.info.tp.ferroviaire.cartographie.models.Gare;
import fr.cours.info.tp.ferroviaire.cartographie.models.Reseau;

/**
 * Service pour gérer les opérations sur le réseau ferroviaire.
 */
public class ReseauService {
    
    private Reseau reseau;

    public ReseauService() {
        this.reseau = new Reseau();
    }

    public ReseauService(Reseau reseau) {
        this.reseau = reseau;
    }

    /**
     * Retourne le réseau courant.
     * @return le réseau
     */
    public Reseau voirReseau() {
        return this.reseau;
    }

    /**
     * Associe une gare à un chemin de fer.
     * @param gare la gare
     * @param cheminDeFer le chemin de fer
     */
    public void associerGare(Gare gare, CheminDeFer cheminDeFer) {
        if (!reseau.getGares().contains(gare)) {
            reseau.ajouterGare(gare);
        }
        if (!reseau.getCheminsDeFer().contains(cheminDeFer)) {
            reseau.getCheminsDeFer().add(cheminDeFer);
        }
    }

    /**
     * Dissocie une gare du réseau.
     * @param gare la gare à dissocier
     */
    public void dissocierGare(Gare gare) {
        reseau.supprimerGare(gare);
    }

    /**
     * Associe deux chemins de fer ensemble.
     * @param cheminDeFer1 premier chemin de fer
     * @param cheminDeFer2 deuxième chemin de fer
     */
    public void associerCheminsDeFer(CheminDeFer cheminDeFer1, CheminDeFer cheminDeFer2) {
        if (!reseau.getCheminsDeFer().contains(cheminDeFer1)) {
            reseau.getCheminsDeFer().add(cheminDeFer1);
        }
        if (!reseau.getCheminsDeFer().contains(cheminDeFer2)) {
            reseau.getCheminsDeFer().add(cheminDeFer2);
        }
    }

    /**
     * Dissocie un chemin de fer du réseau.
     * @param cheminDeFer le chemin de fer à dissocier
     */
    public void dissocierCheminDeFer(CheminDeFer cheminDeFer) {
        reseau.getCheminsDeFer().remove(cheminDeFer);
    }

    /**
     * Recherche une gare par son nom.
     * @param nom le nom de la gare
     * @return la gare trouvée ou null
     */
    public Gare rechercherGare(String nom) {
        return reseau.rechercherGare(nom);
    }

    /**
     * Recherche un chemin de fer par son identifiant.
     * @param id l'identifiant du chemin de fer
     * @return le chemin de fer trouvé ou null
     */
    public CheminDeFer rechercherCheminDeFer(String id) {
        return reseau.getCheminsDeFer().stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
