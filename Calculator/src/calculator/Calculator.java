/*TP0 Exercice 1
 * Eysseric Béatrix
 * 23/09/2024
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author beatr
 */
import java.util.Scanner;
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        
      
        Scanner scanner = new Scanner(System.in); // Crée un objet Scanner pour lire l'entrée de l'utilisateur

        System.out.print("Veuillez saisir un nombre entier : "); // Demande à l'utilisateur de saisir un nombre
        int operateur = scanner.nextInt(); // Récupère la valeur entière saisie et la stocke dans la variable operateur

        System.out.println("Vous avez saisi : " + operateur); // Affiche la valeur saisie
        scanner.close(); // Ferme le scanner
        
        
        
        // Afficher un message pour demander à l'utilisateur une première valeur
        System.out.print("Veuillez entrer la première valeur : ");
        
        // Récupérer la saisie de l'utilisateur dans la variable operande1
        double operande1 = scanner.nextDouble();
        

        
        // Afficher la valeur saisie (facultatif)
        System.out.println("Vous avez saisi : " + operande1);
        
   
        
        
        
        // Afficher un message pour demander à l'utilisateur une première valeur
        System.out.print("Veuillez entrer la deusieme valeur : ");
        
        // Récupérer la saisie de l'utilisateur dans la variable operande1
        double operande2 = scanner.nextDouble();
        
      
        
        // Afficher la valeur saisie (facultatif)
        System.out.println("Vous avez saisi : " + operande2);
        double resultat = 0;
        
            
        if (operateur==1) {
            resultat = operande1 + operande2;
                System.out.println("Le resultat de l'addition est:" + resultat);
        } else if (operateur==2) {
                resultat = operande1 - operande2;
                System.out.println("Le resultat de la soustraction est:" + resultat);
        } else if (operateur==3) {
                resultat = operande1 * operande2;
                System.out.println("Le resultat de la multiplication est:" + resultat);
        } else if (operateur==4) {
                if (operande2 != 0) {
                System.out.println("Le resultat de la soustraction est:" + resultat);
                    resultat = operande1 / operande2;
                } else {
                    System.out.println("Erreur: Division par zero n'est pas autorisé.");
                }
        } else if (operateur==5) {
                resultat = operande1 % operande2;
                System.out.println("Le resultat du modulo est:" + resultat);
            } else {
                System.out.println("operateur invalide.");
                
        }
        
        System.out.println("The result is: " + resultat);
        }
    }

        
   