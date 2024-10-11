package tp2_bieres_eyssefric1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author beatr
 */
public class BouteilleBiere {
    String nom; 
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
    }


}



