package fr.cours.info.tp.ferroviaire.cartographie.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un chemin de fer reliant deux gares.
 * Un chemin de fer a une distance et peut contenir plusieurs voies.
 */
public class CheminDeFer {
    
    private String id;
    private int distance;
    private String nDepart;
    private List<Voie> voies;

    public CheminDeFer() {
        this.voies = new ArrayList<>();
    }

    public CheminDeFer(String id, int distance, String nDepart) {
        this.id = id;
        this.distance = distance;
        this.nDepart = nDepart;
        this.voies = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getNDepart() {
        return nDepart;
    }

    public void setNDepart(String nDepart) {
        this.nDepart = nDepart;
    }

    public List<Voie> getVoies() {
        return voies;
    }

    public void setVoies(List<Voie> voies) {
        this.voies = voies;
    }

    /**
     * Ajoute une voie au chemin de fer.
     * @param sens le sens de la voie
     * @return l'identifiant de la voie créée
     */
    public String ajouterVoie(String sens) {
        Voie voie = new Voie();
        voie.setSens(sens);
        voies.add(voie);
        return "voie-" + voies.size();
    }

    /**
     * Retire la dernière voie du chemin de fer.
     * @return l'identifiant de la voie retirée, ou null si aucune voie
     */
    public String retirerVoie() {
        if (!voies.isEmpty()) {
            voies.remove(voies.size() - 1);
            return "voie-" + (voies.size() + 1);
        }
        return null;
    }
}
