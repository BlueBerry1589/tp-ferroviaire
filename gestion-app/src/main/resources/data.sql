-- Initial data for the ferroviaire database

-- Insert gares
INSERT INTO gare (id, nom, nombre_quais) VALUES (1, 'Le Mans', 3);
INSERT INTO gare (id, nom, nombre_quais) VALUES (2, 'Paris Montparnasse', 12);
INSERT INTO gare (id, nom, nombre_quais) VALUES (3, 'Lyon Part-Dieu', 8);

-- Insert trains
INSERT INTO train (id, matricule, type, vitesse_max) VALUES (1, 'TGV-8921', 'TGV', 320);
INSERT INTO train (id, matricule, type, vitesse_max) VALUES (2, 'TER-1234', 'TER', 160);
INSERT INTO train (id, matricule, type, vitesse_max) VALUES (3, 'TGV-5678', 'TGV', 300);
