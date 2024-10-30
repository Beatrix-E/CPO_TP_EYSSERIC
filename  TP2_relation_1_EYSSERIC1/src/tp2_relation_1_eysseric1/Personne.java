/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_eysseric1;

/**
 *
 * @author beatr
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures; // Nombre de voitures possédées
    Voiture[] liste_voitures;

    // Constructeur
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.liste_voitures = new Voiture[3]; // Réserve de la mémoire pour 3 voitures
        this.nbVoitures = 0; // Initialisation du nombre de voitures possédées à 0
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nbVoitures=" + nbVoitures +
                '}';
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Méthode pour ajouter une voiture
    public void ajouterVoiture(Voiture voiture) {
        if (nbVoitures  < 3) {
            liste_voitures[nbVoitures ] = voiture;
            nbVoitures ++;
            voiture.setProprietaire(this); // Définir le propriétaire de la voiture
        } else {
            System.out.println("Limite de voitures atteinte.");
        }
    }
    
    // Méthode pour obtenir la liste des voitures
    public Voiture[] getListeVoitures() {
        return liste_voitures;
    }


// Méthode pour ajouter une voiture
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        // Vérification si la voiture a déjà un propriétaire
        if (voiture_a_ajouter.getProprietaire() != null) {
            return false; // La voiture est déjà possédée
        }
        // Vérification de la capacité du propriétaire
        if (nbVoitures >= 3) {
            return false; // Limite atteinte
        }
        // Ajout de la voiture
        liste_voitures[nbVoitures] = voiture_a_ajouter; // Ajoute la voiture au tableau
        nbVoitures++; // Incrémente le compteur de voitures
        voiture_a_ajouter.setProprietaire(this); // Définit le propriétaire de la voiture
        return true; // Ajout réussi
    }

    // Autres méthodes...
}