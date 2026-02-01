package fr.cours.info.tp.ferroviaire.cartographie.models;

/**
 * Représente une gare du réseau ferroviaire.
 * Une gare possède un nom, un nombre de quais, une adresse et une ville.
 * 
 * @author BlueBerry1589
 * @version 1.0
 */
public class Gare {
    
    /** Le nom de la gare */
    private String nom;
    
    /** Le nombre de quais de la gare */
    private int nombreQuais;
    
    /** L'adresse de la gare */
    private String adresse;
    
    /** La ville où se situe la gare */
    private String ville;

    /**
     * Constructeur par défaut.
     */
    public Gare() {
    }

    /**
     * Constructeur avec paramètres.
     * 
     * @param nom le nom de la gare
     * @param nombreQuais le nombre de quais
     */
    public Gare(String nom, int nombreQuais) {
        this.nom = nom;
        this.nombreQuais = nombreQuais;
    }

    /**
     * Retourne le nom de la gare.
     * 
     * @return le nom de la gare
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom de la gare.
     * 
     * @param nom le nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le nombre de quais.
     * 
     * @return le nombre de quais
     */
    public int getNombreQuais() {
        return nombreQuais;
    }

    /**
     * Définit le nombre de quais.
     * 
     * @param nombreQuais le nouveau nombre de quais
     */
    public void setNombreQuais(int nombreQuais) {
        this.nombreQuais = nombreQuais;
    }

    /**
     * Retourne l'adresse de la gare.
     * 
     * @return l'adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Définit l'adresse de la gare.
     * 
     * @param adresse la nouvelle adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Retourne la ville de la gare.
     * 
     * @return la ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * Définit la ville de la gare.
     * 
     * @param ville la nouvelle ville
     */
    public void setVille(String ville) {
        this.ville = ville;
    }
}
