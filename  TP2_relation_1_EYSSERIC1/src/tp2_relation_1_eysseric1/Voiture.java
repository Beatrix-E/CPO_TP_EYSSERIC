/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_eysseric1;

/**
 *
 * @author beatr
 */
public class Voiture {
    String modele;
    String marque;
    int places;
    Personne proprietaire; // Attribut pour le propriétaire

    // Constructeur
    public Voiture(String modele, String marque, int places) {
        this.modele = modele;
        this.marque = marque;
        this.places = places;
        this.proprietaire = null; // Initialisé à NULL
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Voiture{" +
                "modele='" + modele + '\'' +
                ", marque='" + marque + '\'' +
                ", places=" + places +
                ", proprietaire=" + (proprietaire != null ? proprietaire.getNom() : "Aucun") +
                '}';
    }
    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }
}
