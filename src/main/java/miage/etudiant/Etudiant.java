package miage.etudiant;

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
        
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
        return result;
    }


}
