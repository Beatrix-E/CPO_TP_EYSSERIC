/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_eysseric1;

/**
 *
 * @author beatr
 */
public class Baton extends Arme {
    private int age;  // Un attribut spécifique au bâton

    // Constructeur du bâton
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);  // Appel au constructeur de la classe parente (Arme)
        
        // Vérification que l'âge est valide
        if (age < 0 || age >= 100) {
            throw new IllegalArgumentException("L'âge du bâton doit être inférieur à 100.");
        }
        this.age = age;
    }

    // Getter pour l'âge
    public int getAge() {
        return this.age;
    }

    // Implémentation de la méthode "utiliser" pour le bâton
    

    // Méthode toString pour afficher le bâton avec son paramètre "âge"
    @Override
    public String toString() {
        return super.toString() + ", Âge: " + this.age;
    }
}

    

