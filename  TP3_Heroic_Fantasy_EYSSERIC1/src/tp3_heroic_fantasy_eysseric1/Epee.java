/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_eysseric1;

/**
 *
 * @author beatr
 */
public class Epee extends Arme {
     
   
    private int finesse;  // Un attribut spécifique à l'épée

    // Constructeur de l'épée
    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);  // Appel au constructeur de la classe parente (Arme)
        
        // Vérification que la finesse est valide
        if (finesse < 0 || finesse >= 100) {
            throw new IllegalArgumentException("La finesse doit être inférieure à 100.");
        }
        this.finesse = finesse;
    }

    // Getter pour la finesse
    public int getFinesse() {
        return this.finesse;
    }

      
       

    // Méthode toString pour afficher l'épée avec son paramètre "finesse"

    @Override
    public String toString() {
        return "Epee{" + "finesse: " + finesse + '}';
    }
    
}

    

    
    
