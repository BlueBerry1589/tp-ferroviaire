package fr.cours.info.tp.ferroviaire.cartographie.models;

/**
 * Représente une voie ferrée sur laquelle circulent les trains.
 * Une voie a un sens unique de circulation et une vitesse maximale autorisée.
 */
public class Voie {
    
    private String sens;
    private int vitMax;
    private String idGareStart;

    public Voie() {
    }

    public Voie(String sens, int vitMax, String idGareStart) {
        this.sens = sens;
        this.vitMax = vitMax;
        this.idGareStart = idGareStart;
    }

    public String getSens() {
        return sens;
    }

    public void setSens(String sens) {
        this.sens = sens;
    }

    public int getVitMax() {
        return vitMax;
    }

    public void setVitMax(int vitMax) {
        this.vitMax = vitMax;
    }

    public String getIdGareStart() {
        return idGareStart;
    }

    public void setIdGareStart(String idGareStart) {
        this.idGareStart = idGareStart;
    }
}
