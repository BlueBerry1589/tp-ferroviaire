package fr.cours.info.tp.ferroviaire.bdd.repositories;

import fr.cours.info.tp.ferroviaire.bdd.models.GareDAO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GareRepository extends CrudRepository<GareDAO, Long> {
    
    GareDAO findByNom(String nom);
}
