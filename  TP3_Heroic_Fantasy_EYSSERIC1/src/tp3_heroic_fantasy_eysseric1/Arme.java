package tp3_heroic_fantasy_eysseric1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author beatr
 */
public abstract class Arme {
    String nom;
    int niveauAttaque;

    public Arme(String nom, int niveau) {
        if (niveauAttaque < 0 || niveauAttaque > 100) {
            throw new IllegalArgumentException("Le niveau d'attaque doit être compris entre 0 et 100.");
        }
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }
    
    
    public String getNom() {
        return this.nom;
    }
 
    public int getNiveauAttaque() {
        return this.niveauAttaque;
    }

    @Override
    public String toString() {
        return "Arme{" + "nom de l'arme: " + nom + ", niveau d'attaque: " + niveauAttaque + '}';
    }
    
     // Méthode abstraite (si nécessaire) : les classes dérivées devront la définir
    public abstract void utiliser();
}
