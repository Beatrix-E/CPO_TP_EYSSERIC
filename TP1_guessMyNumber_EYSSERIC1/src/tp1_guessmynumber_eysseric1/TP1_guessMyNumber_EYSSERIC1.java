/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_eysseric1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author beatr
 */
public class TP1_guessMyNumber_EYSSERIC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();

        // Choix du niveau de difficulté
        System.out.println("Choisissez votre niveau de difficulté (facile, normal, difficile, cauchemar) : ");
        String difficulte = scanner.nextLine().toLowerCase();
        
        int maxTentatives = 10; // Valeur par défaut
        int rangeMax = 100; // Valeur par défaut
        int malusProb = 0; // Pour le mode cauchemar
        
        switch (difficulte) {
            case "facile":
                maxTentatives = 15;
                break;
            case "normal":
                maxTentatives = 10;
                break;
            case "difficile":
                maxTentatives = 5;
                break;
            case "cauchemar":
                maxTentatives = 5;
                malusProb = 30; // Probabilité de donner la mauvaise indication
                break;
            default:
                System.out.println("Niveau de difficulté non reconnu, passage en mode normal.");
        }

        // Génération d'un nombre aléatoire
        int nombreSecret = generateurAleat.nextInt(rangeMax + 1);
        int tentatives = 0;
        boolean trouve = false;

        System.out.println("Devinez un nombre entre 0 et " + rangeMax + " :");

        while (tentatives < maxTentatives && !trouve) {
            System.out.print("Entrez votre nombre : ");
            int nombreUtilisateur = scanner.nextInt();
            tentatives++;

            if (nombreUtilisateur == nombreSecret) {
                trouve = true;
                System.out.println("Gagné ! Vous avez trouvé le nombre en " + tentatives + " tentatives.");
            } else {
                String message = "";
                boolean donnerMauvaiseIndication = (difficulte.equals("cauchemar") && generateurAleat.nextInt(100) < malusProb);
                
                if (donnerMauvaiseIndication) {
                    // Donner une mauvaise indication
                    message = (nombreUtilisateur < nombreSecret) ? "Trop grand !" : "Trop petit !";
                } else {
                    // Indication correcte
                    message = (nombreUtilisateur < nombreSecret) ? "Trop petit !" : "Trop grand !";
                }

                if (tentatives < maxTentatives) {
                    System.out.println(message + " Essais restants : " + (maxTentatives - tentatives));
                } else {
                    System.out.println(message + " Vous avez épuisé vos tentatives !");
                }
            }
        }

        if (!trouve) {
            System.out.println("Le nombre secret était : " + nombreSecret);
        }

        scanner.close();
    }
}
        

