package fr.cours.info.tp.ferroviaire.controllers;

import fr.cours.info.tp.ferroviaire.bdd.models.TrainDAO;
import fr.cours.info.tp.ferroviaire.services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TrainViewController {

    @Autowired
    private TrainService service;

    @GetMapping("/ihm/trains")
    public String ihmListeTrains(Model model) {
        // CORRECTION 1 : Ta méthode s'appelle 'listerTous' (avec un S) et non 'listerTout'
        // On transforme l'Iterable en List pour Thymeleaf
        Iterable<TrainDAO> it = service.listerTous();
        List<TrainDAO> liste = new ArrayList<>();
        it.forEach(liste::add);

        model.addAttribute("liste", liste);
        return "ihm_liste_trains";
    }

    @GetMapping("/ihm/train")
    public String ihmConsulterTrain(
            @RequestParam(value = "matricule", required = true) String matricule,
            Model model
    ) {
        TrainDAO train = service.rechercher(matricule);

        if (train == null) {
            train = new TrainDAO();
            train.setMatricule(matricule + " (Inexistant)");
            // CORRECTION 2 : Tes champs s'appellent 'type' et 'vitesseMax' (pas 'modele')
            train.setType("Inconnu");
            train.setVitesseMax(0);
        }

        model.addAttribute("train", train);
        return "ihm_train";
    }
}