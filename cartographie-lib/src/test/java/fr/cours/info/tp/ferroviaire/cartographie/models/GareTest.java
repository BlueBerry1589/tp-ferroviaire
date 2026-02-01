package fr.cours.info.tp.ferroviaire.cartographie.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GareTest {

    @Test
    void testCreerGare() {
        Gare gare = new Gare("Paris", 5);
        
        assertEquals("Paris", gare.getNom());
        assertEquals(5, gare.getNombreQuais());
    }

    @Test
    void testSettersGare() {
        Gare gare = new Gare();
        gare.setNom("Lyon");
        gare.setNombreQuais(3);
        
        assertEquals("Lyon", gare.getNom());
        assertEquals(3, gare.getNombreQuais());
    }
}
