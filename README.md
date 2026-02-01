# Gestion Réseau Ferroviaire

Application de gestion d'un réseau ferroviaire développée avec Spring Boot.

## Structure du projet

```
├── cartographie-lib/     # Bibliothèque de modèles (Gare, Train, Reseau)
├── gestion-app/          # Application Spring Boot principale
└── usager-app/           # Application usager (à développer)
```

## Technologies

- Spring Boot 3.1.5
- Spring Data JPA
- H2 Database (persistant)
- Thymeleaf (UI)
- Maven

## Lancer l'application

```bash
cd gestion-app
mvn spring-boot:run
```

## URLs

| URL | Description |
|-----|-------------|
| http://localhost:8080/ | Page d'accueil |
| http://localhost:8080/trains | Liste des trains |
| http://localhost:8080/gares | Liste des gares |
| http://localhost:8080/h2 | Console H2 |

## API REST

### Trains
- `GET /train/liste` - Liste tous les trains
- `GET /train/consulter?matricule=XXX` - Consulter un train
- `POST /train/creer?matricule=XXX&type=TGV&vitesseMax=320` - Créer un train

### Gares
- `GET /gare/liste` - Liste toutes les gares
- `GET /gare/consulter?nom=XXX` - Consulter une gare
- `POST /gare/creer?nom=XXX&nombreQuais=5` - Créer une gare

## Base de données H2

- JDBC URL: `jdbc:h2:file:./data/ferroviairedb`
- Username: `sa`
- Password: (vide)

## Fonctionnalités UI

- Ajouter, modifier, supprimer des trains
- Ajouter, modifier, supprimer des gares
- Consultation des détails

## Auteurs

BlueBerry1589(Bilal MARGHICH)
Taha Rachedi
