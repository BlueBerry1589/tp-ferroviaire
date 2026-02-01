package fr.cours.info.tp.ferroviaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "fr.cours.info.tp.ferroviaire")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
