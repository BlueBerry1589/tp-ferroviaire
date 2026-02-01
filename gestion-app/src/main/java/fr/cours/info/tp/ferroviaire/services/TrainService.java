package fr.cours.info.tp.ferroviaire.services;

import fr.cours.info.tp.ferroviaire.bdd.models.TrainDAO;
import fr.cours.info.tp.ferroviaire.bdd.repositories.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {

    private final TrainRepository repository;

    @Autowired
    public TrainService(TrainRepository repository) {
        this.repository = repository;
    }

    /**
     * Crée un nouveau train avec le matricule spécifié.
     * @param matricule le matricule du train
     * @return le train créé
     */
    public TrainDAO creer(String matricule) {
        TrainDAO train = new TrainDAO();
        train.setMatricule(matricule);
        return repository.save(train);
    }

    /**
     * Recherche un train par son matricule.
     * @param matricule le matricule du train
     * @return le train trouvé ou null
     */
    public TrainDAO rechercher(String matricule) {
        return repository.findByMatricule(matricule);
    }

    /**
     * Récupère tous les trains.
     * @return la liste de tous les trains
     */
    public Iterable<TrainDAO> listerTous() {
        return repository.findAll();
    }
}
