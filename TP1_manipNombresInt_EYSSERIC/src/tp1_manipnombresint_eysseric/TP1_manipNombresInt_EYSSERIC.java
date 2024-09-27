/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_eysseric;

import java.util.Scanner;

/**
 *
 * @author beatr
 */
public class TP1_manipNombresInt_EYSSERIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur de saisir le premier entier
        System.out.print("Veuillez saisir le premier entier : ");
        int premierEntier = scanner.nextInt();
        
        // Demande à l'utilisateur de saisir le deuxième entier
        System.out.print("Veuillez saisir le deuxième entier : ");
        int deuxiemeEntier = scanner.nextInt();
        
        // Calcul des résultats
        int somme = premierEntier + deuxiemeEntier;
        int difference = premierEntier - deuxiemeEntier;
        int produit = premierEntier * deuxiemeEntier;
        
         // Calcul du quotient et du reste
        int quotient = premierEntier / deuxiemeEntier;
        int reste = premierEntier % deuxiemeEntier;
        
        // Affichage des résultats
        System.out.println("Voici les résultats de vos opérations :");
        System.out.println("La somme de " + premierEntier + " et " + deuxiemeEntier + " est : " + somme);
        System.out.println("La différence entre " + premierEntier + " et " + deuxiemeEntier + " est : " + difference);
        System.out.println("Le produit de " + premierEntier + " et " + deuxiemeEntier + " est : " + produit);
        System.out.println("Le quotient entier de " + premierEntier + " divisé par " + deuxiemeEntier + " est : " + quotient);
        System.out.println("Le reste de la division euclidienne de " + premierEntier + " par " + deuxiemeEntier + " est : " + reste);
        
    }
    
}
