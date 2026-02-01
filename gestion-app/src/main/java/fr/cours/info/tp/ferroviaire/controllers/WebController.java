package fr.cours.info.tp.ferroviaire.controllers;

import fr.cours.info.tp.ferroviaire.services.GareService;
import fr.cours.info.tp.ferroviaire.services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @Autowired
    private TrainService trainService;

    @Autowired
    private GareService gareService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/trains")
    public String trains(Model model) {
        model.addAttribute("trains", trainService.listerTous());
        return "trains";
    }

    @GetMapping("/trains/view")
    public String viewTrain(@RequestParam String matricule, Model model) {
        model.addAttribute("train", trainService.rechercher(matricule));
        return "train-detail";
    }

    @GetMapping("/trains/add")
    public String addTrainForm() {
        return "train-form";
    }

    @PostMapping("/trains/add")
    public String addTrain(@RequestParam String matricule,
                           @RequestParam String type,
                           @RequestParam int vitesseMax) {
        trainService.creer(matricule, type, vitesseMax);
        return "redirect:/trains";
    }

    @GetMapping("/gares")
    public String gares(Model model) {
        model.addAttribute("gares", gareService.listerToutes());
        return "gares";
    }

    @GetMapping("/gares/view")
    public String viewGare(@RequestParam String nom, Model model) {
        model.addAttribute("gare", gareService.rechercher(nom));
        return "gare-detail";
    }

    @GetMapping("/gares/add")
    public String addGareForm() {
        return "gare-form";
    }

    @PostMapping("/gares/add")
    public String addGare(@RequestParam String nom,
                          @RequestParam int nombreQuais) {
        gareService.creer(nom, nombreQuais);
        return "redirect:/gares";
    }
}
