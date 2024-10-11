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

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    public boolean Décapsuler(){
        if (!ouverte){
            ouverte = true; // Ouvre la bière
            return true; // Opération réussie
        }else{
            System.out.println("Erreur : bière déjà ouverte");
            return false; // Opération échouée
        }
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true ) {
            chaine_a_retourner += "oui" ;
        }else{
            chaine_a_retourner += "non" ;
        }
        return chaine_a_retourner ;
    }
}



