package miage.etudiant;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EtudiantTest {

    private final String NOM = "Cissé";
    private final String PRENOM = "Moussa"; 
    
    // Test du constructeur avec des paramètres corrects
    @Test
    void testConstructorCorrectParameters() {
            assertDoesNotThrow(() -> new Etudiant(NOM, PRENOM));
    }

    // Test des getters
    @Test
    void testGettersWithCorrectEtudiant() {
        Etudiant etudiant = new Etudiant(NOM, PRENOM);
        final String ActualNom = etudiant.getNom();
        final String ActualPrenom = etudiant.getPrenom();
        assertEquals(NOM, ActualNom, "Le nom retourné par getNom() ne correspond pas au nom fourni dans le constructeur.");
        assertEquals(PRENOM, ActualPrenom, "Le prénom retourné par getPrenom() ne correspond pas au prénom fourni dans le constructeur.");
    }
    
    // Test de l'equals
    // @Test
    // void testEqualsWithSameEtudiant() {
    //     Etudiant etudiant1 = new Etudiant(NOM, PRENOM);
    //     Etudiant etudiant2 = new Etudiant(NOM, PRENOM);
    //     assertEquals(etudiant1, etudiant2, "Deux étudiants avec les mêmes nom et prénom devraient être considérés comme égaux.");
    // }

    // @Test
    // void testEqualsWithDifferentEtudiant() {
    //     Etudiant etudiant1 = new Etudiant(NOM, PRENOM);
    //     Etudiant etudiant2 = new Etudiant("Dupont", "Jean");
    //     assertEquals(false, etudiant1.equals(etudiant2), "Deux étudiants avec des noms et prénoms différents ne devraient pas être considérés comme égaux.");
    // }

    // this == obj
    @Test
    void testEqualsWithSameReference() {
        Etudiant etudiant = new Etudiant(NOM, PRENOM);
        assertEquals(true, etudiant.equals(etudiant), "Un étudiant devrait être égal à lui-même.");
    }

    // obj == null
    @Test
    void testEqualsWithNull() {
        Etudiant etudiant = new Etudiant(NOM, PRENOM);
        assertEquals(false, etudiant.equals(null), "Un étudiant ne devrait pas être égal à null.");
    }   

    //getClass() != obj.getClass()

    @Test
    void testEqualsWithDifferentClass() {
        Etudiant etudiant = new Etudiant(NOM, PRENOM);
        String notAnEtudiant = "Je ne suis pas un étudiant";
        assertEquals(false, etudiant.equals(notAnEtudiant), "Un étudiant ne devrait pas être égal à un objet d'une classe différente.");
    }

    //!nom.equals(etudiant.nom)
    @Test
    void testEqualsWithDifferentNom() {
        Etudiant etudiant1 = new Etudiant(NOM, PRENOM); 
        Etudiant etudiant2 = new Etudiant("Dupont", PRENOM);        
        assertEquals(false, etudiant1.equals(etudiant2), "Deux étudiants avec des noms différents ne devraient pas быть considérés comme égaux.");
    }

    //prenom.equals(etudiant.prenom)
    @Test
    void testEqualsWithDifferentPrenom() {
        Etudiant etudiant1 = new Etudiant(NOM, PRENOM);
        Etudiant etudiant2 = new Etudiant(NOM, "Jean");
        assertEquals(false, etudiant1.equals(etudiant2), "Deux étudiants avec des prénoms différents ne devraient pas être considérés comme égaux.");
    }

    // Test du hashCode
    @Test
    void testHashCodeWithSameEtudiant() {
        Etudiant etudiant1 = new Etudiant(NOM, PRENOM);
        Etudiant etudiant2 = new Etudiant(NOM, PRENOM);
        assertEquals(etudiant1.hashCode(), etudiant2.hashCode(), "Deux étudiants égaux devraient avoir le même hash code.");
    }

    // Test du hashCode avec des étudiants différents
    @Test
    void testHashCodeWithDifferentEtudiant() {
        Etudiant etudiant1 = new Etudiant(NOM, PRENOM);
        Etudiant etudiant2 = new Etudiant("Dupont", "Jean");
        assertEquals(false, etudiant1.hashCode() == etudiant2.hashCode(), "Deux étudiants différents ne devraient pas avoir le même hash code.");
    }  
    
    //(nom == null)

    @Test
    void testHashCodeWithNullNom() {
        Etudiant etudiant = new Etudiant(null, PRENOM);
        assertDoesNotThrow(() -> etudiant.hashCode(), "Le hash code devrait être calculé sans lancer d'exception même si le nom est null.");
    }

    //(prenom == null)

    @Test
    void testHashCodeWithNullPrenom() {
        Etudiant etudiant = new Etudiant(NOM, null);
        assertDoesNotThrow(() -> etudiant.hashCode(), "Le hash code devrait être calculé sans lancer d'exception meme si le prrenom est null.");
    }

}
