package ma.projet.beans;

public class Client {
    private int id;
    private String nom;
    private String prenom;

    // Constructeur avec trois paramètres
    public Client(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Constructeur avec deux paramètres
    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getter pour 'id'
    public int getId() {
        return id;
    }

    // Setter pour 'id'
    public void setId(int id) {
        this.id = id;
    }

    // Getter pour 'nom'
    public String getNom() {
        return nom;
    }

    // Setter pour 'nom'
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter pour 'prenom'
    public String getPrenom() {
        return prenom;
    }

    // Setter pour 'prenom'
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
