package Miage;

public class Etudiant {
    private String nom;
    private String prenom;

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public  boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Etudiant etudiant = (Etudiant) obj;

        if (!nom.equals(etudiant.nom)) return false;
        return prenom.equals(etudiant.prenom);
    }
    // Comme on a Equals, on s'amuse à faire le hashcode bien évidentement 

    @Override
    public int hashCode() {
        int result = nom.hashCode();
        result = 31 * result + prenom.hashCode();
        return result;
    }

    
}
