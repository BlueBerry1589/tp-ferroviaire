package fr.cours.info.tp.ferroviaire.controllers;

import fr.cours.info.tp.ferroviaire.bdd.models.GareDAO;
import fr.cours.info.tp.ferroviaire.services.GareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gare")
public class GareController {

    @Autowired
    private GareService service;

    @GetMapping("/consulter")
    public GareDAO consulterGare(@RequestParam(value = "nom", required = true) String nom) {
        return service.rechercher(nom);
    }

    @GetMapping("/liste")
    public Iterable<GareDAO> listerGares() {
        return service.listerToutes();
    }

    @PostMapping("/creer")
    public GareDAO creerGare(@RequestParam(value = "nom") String nom,
                             @RequestParam(value = "nombreQuais", required = false, defaultValue = "1") int nombreQuais) {
        return service.creer(nom, nombreQuais);
    }
}
