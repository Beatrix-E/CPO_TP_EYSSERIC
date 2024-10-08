/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_eysseric;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author beatr
 */
public class TP1_stats_EYSSERIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();

        // Création et initialisation du tableau
        int[] resultatDes = new int[6]; // Tableau pour les faces du dé (0 à 5)
        
        // Demander à l'utilisateur de saisir un nombre entier m
        System.out.print("Entrez le nombre de lancers de dés (m) : ");
        int m = scanner.nextInt();

        // Boucle pour simuler m lancers de dés
        for (int i = 0; i < m; i++) {
            int lancer = generateurAleat.nextInt(6); // Génère un nombre entre 0 et 5
            resultatDes[lancer]++; // Incrémente le compteur de la face correspondante
        }

        // Affichage des résultats
        System.out.println("Résultats des lancers de dés :");
        for (int i = 0; i < resultatDes.length; i++) {
            double pourcentage = (double) resultatDes[i] / m * 100; // Calcul du pourcentage
            System.out.printf("Face %d : %d fois (%.2f%%)\n", i + 1, resultatDes[i], pourcentage);
        }

        scanner.close();
    }
} 

