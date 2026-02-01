package fr.cours.info.tp.ferroviaire.services;

import fr.cours.info.tp.ferroviaire.bdd.models.TrainDAO;
import fr.cours.info.tp.ferroviaire.bdd.repositories.TrainRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TrainServiceTest {

    @Mock
    private TrainRepository repository;

    private TrainService service;

    @BeforeEach
    void setUp() {
        service = new TrainService(repository);
    }

    @Test
    void creer_matricule_ok() {
        // Arrange
        TrainDAO trainMock = new TrainDAO();
        trainMock.setMatricule("8921");
        when(repository.save(any(TrainDAO.class))).thenReturn(trainMock);

        // Act
        TrainDAO train = service.creer("8921");

        // Assert
        assertEquals("8921", train.getMatricule());
    }

    @Test
    void rechercher_matricule_existant() {
        // Arrange
        TrainDAO trainMock = new TrainDAO();
        trainMock.setMatricule("TGV-1234");
        trainMock.setType("TGV");
        when(repository.findByMatricule("TGV-1234")).thenReturn(trainMock);

        // Act
        TrainDAO train = service.rechercher("TGV-1234");

        // Assert
        assertNotNull(train);
        assertEquals("TGV-1234", train.getMatricule());
        assertEquals("TGV", train.getType());
    }

    @Test
    void rechercher_matricule_inexistant() {
        // Arrange
        when(repository.findByMatricule("INCONNU")).thenReturn(null);

        // Act
        TrainDAO train = service.rechercher("INCONNU");

        // Assert
        assertNull(train);
    }
}
