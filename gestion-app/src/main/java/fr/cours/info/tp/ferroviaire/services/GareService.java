package fr.cours.info.tp.ferroviaire.services;

import fr.cours.info.tp.ferroviaire.bdd.models.GareDAO;
import fr.cours.info.tp.ferroviaire.bdd.repositories.GareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GareService {

    private final GareRepository repository;

    @Autowired
    public GareService(GareRepository repository) {
        this.repository = repository;
    }

    /**
     * Crée une nouvelle gare.
     * @param nom le nom de la gare
     * @param nombreQuais le nombre de quais
     * @return la gare créée
     */
    public GareDAO creer(String nom, int nombreQuais) {
        GareDAO gare = new GareDAO(nom, nombreQuais);
        return repository.save(gare);
    }

    /**
     * Recherche une gare par son nom.
     * @param nom le nom de la gare
     * @return la gare trouvée ou null
     */
    public GareDAO rechercher(String nom) {
        return repository.findByNom(nom);
    }

    /**
     * Récupère toutes les gares.
     * @return la liste de toutes les gares
     */
    public Iterable<GareDAO> listerToutes() {
        return repository.findAll();
    }

    public GareDAO modifier(String nom, String nouveauNom, int nombreQuais) {
        GareDAO gare = repository.findByNom(nom);
        if (gare != null) {
            gare.setNom(nouveauNom);
            gare.setNombreQuais(nombreQuais);
            return repository.save(gare);
        }
        return null;
    }

    public void supprimer(String nom) {
        GareDAO gare = repository.findByNom(nom);
        if (gare != null) {
            repository.delete(gare);
        }
    }
}
