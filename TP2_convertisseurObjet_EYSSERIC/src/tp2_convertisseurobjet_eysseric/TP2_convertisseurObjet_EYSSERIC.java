/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_eysseric;

import java.util.Scanner;

/**
 *
 * @author beatr
 */
public class TP2_convertisseurObjet_EYSSERIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        convertisseur convertisseur1 = new convertisseur();
        convertisseur convertisseur2 = new convertisseur();

        System.out.println("Choisissez un convertisseur :");
        System.out.println("1) Convertir avec le premier convertisseur");
        System.out.println("2) Convertir avec le second convertisseur");
        
        int choixconvertisseur = scanner.nextInt();
        
        
       
        // Demande de saisie d'une valeur
        System.out.print("Bonjour, saisissez une valeur : ");
        double temperature = scanner.nextDouble();

        
        
        // Affichage du menu de conversion
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Celsius vers Fahrenheit");
        System.out.println("4) De Fahrenheit vers Celsius");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");
        
      

        // Saisie du choix de l'utilisateur
        int choix1 = scanner.nextInt();
        switch (choix1) {
            case 1:
                System.out.println(temperature + " degrés Celsius est égal à " + convertisseur1.CelciusVersKelvin(temperature) + " degrés Kelvin");
                break;
            case 2:
                System.out.println(temperature + " degrés Kelvin est égal à " + convertisseur1.KelvinVersCelcius(temperature) + " degrés Celsius");
                break;
            case 3:
                System.out.println(temperature + " degrés Celsius est égal à " + convertisseur1.CelciusVersFahrenheit(temperature) + " degrés Fahrenheit");
                break;
            case 4:
                System.out.println(temperature + " degrés Fahrenheit est égal à " + convertisseur1.FahrenheitVersCelcius(temperature) + " degrés Celsius");
                break;
            case 5:
                System.out.println(temperature + " degrés Kelvin est égal à " + convertisseur1.KelvinVersFahrenheit(temperature) + " degrés Fahrenheit");
                break;
            case 6:
                System.out.println(temperature + " degrés Fahrenheit est égal à " + convertisseur1.FahrenheitVersKelvin(temperature) + " degrés Kelvin");
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
        
        
      
      

        int choix2 = scanner.nextInt();
        switch (choix2) {
            case 1:
                System.out.println(temperature + " degrés Celsius est égal à " + convertisseur2.CelciusVersKelvin(temperature) + " degrés Kelvin");
                break;
            case 2:
                System.out.println(temperature + " degrés Kelvin est égal à " + convertisseur2.KelvinVersCelcius(temperature) + " degrés Celsius");
                break;
            case 3:
                System.out.println(temperature + " degrés Celsius est égal à " + convertisseur2.CelciusVersFahrenheit(temperature) + " degrés Fahrenheit");
                break;
            case 4:
                System.out.println(temperature + " degrés Fahrenheit est égal à " + convertisseur2.FahrenheitVersCelcius(temperature) + " degrés Celsius");
                break;
            case 5:
                System.out.println(temperature + " degrés Kelvin est égal à " + convertisseur2.KelvinVersFahrenheit(temperature) + " degrés Fahrenheit");
                break;
            case 6:
                System.out.println(temperature + " degrés Fahrenheit est égal à " + convertisseur2.FahrenheitVersKelvin(temperature) + " degrés Kelvin");
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
        
        
        

        // Affiche le nombre de conversions effectuées
        System.out.println(convertisseur1);
        System.out.println(convertisseur2);

    }
}