package fr.cours.info.tp.ferroviaire.controllers;

import fr.cours.info.tp.ferroviaire.bdd.models.TrainDAO;
import fr.cours.info.tp.ferroviaire.services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/train")
public class TrainController {

    @Autowired
    private TrainService service;

    @GetMapping("/consulter")
    public TrainDAO consulterTrain(@RequestParam(value = "matricule", required = true) String matricule) {
        TrainDAO train = service.rechercher(matricule);
        if (train == null) {
            // Si le train n'existe pas, on le crée
            train = service.creer(matricule);
        }
        return train;
    }

    @GetMapping("/liste")
    public Iterable<TrainDAO> listerTrains() {
        return service.listerTous();
    }

    @PostMapping("/creer")
    public TrainDAO creerTrain(@RequestParam(value = "matricule") String matricule,
                               @RequestParam(value = "type", required = false, defaultValue = "TER") String type,
                               @RequestParam(value = "vitesseMax", required = false, defaultValue = "160") int vitesseMax) {
        TrainDAO train = new TrainDAO(matricule, type, vitesseMax);
        return service.creer(matricule);
    }
}
