-- Initial data for the ferroviaire database

-- Insert gares (let ID be auto-generated)
INSERT INTO gare (nom, nombre_quais) VALUES ('Le Mans', 3);
INSERT INTO gare (nom, nombre_quais) VALUES ('Paris Montparnasse', 12);
INSERT INTO gare (nom, nombre_quais) VALUES ('Lyon Part-Dieu', 8);

-- Insert trains (let ID be auto-generated)
INSERT INTO train (matricule, type, vitesse_max) VALUES ('TGV-8921', 'TGV', 320);
INSERT INTO train (matricule, type, vitesse_max) VALUES ('TER-1234', 'TER', 160);
INSERT INTO train (matricule, type, vitesse_max) VALUES ('TGV-5678', 'TGV', 300);
