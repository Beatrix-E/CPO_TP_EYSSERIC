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
        
        // Affichage des entiers saisis
        System.out.println("Vous avez saisi : " + premierEntier + " et " + deuxiemeEntier);
        
    }
    
}
