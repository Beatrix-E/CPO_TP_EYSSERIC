/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_eysseric1;

import java.util.Scanner;

/**
 *
 * @author beatr
 */
public class TP1_convertisseur_EYSSERIC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur de saisir une valeur réelle
        System.out.print("Veuillez saisir une valeur réelle : ");
        double valeurReelle = scanner.nextDouble();
        
        // Affichage de la valeur saisie
        System.out.println("Vous avez saisi : " + valeurReelle);
        
        // Demande à l'utilisateur de saisir une température en degrés Celsius
        System.out.print("Veuillez saisir une température en degrés Celsius : ");
        double temperatureCelsius = scanner.nextDouble();
        
        // Conversion de Celsius à Kelvin
        double temperatureKelvin = temperatureCelsius + 273;
        
        // Affichage des résultats
        System.out.println("La température en degrés Kelvin est : " + temperatureKelvin);
        
    }
    // Méthode pour convertir Celsius en Kelvin
    public static double CelciusVersKelvin(double celsius) {
        return celsius + 273; // Formule de conversion
    }
    
    public static double KelvinVersCelcius(double kelvin) {
        return kelvin - 273.15; // Conversion de Kelvin à Celsius
    }

    public static double FarenheitVersCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // Conversion de Fahrenheit à Celsius
    }

    public static double CelciusVersFarenheit(double celsius) {
        return (celsius * 9 / 5) + 32; // Conversion de Celsius à Fahrenheit
    }

    public static double KelvinVersFarenheit(double kelvin) {
        return CelciusVersFarenheit(KelvinVersCelcius(kelvin)); // Conversion de Kelvin à Fahrenheit
    }

    public static double FarenheitVersKelvin(double fahrenheit) {
        return CelciusVersKelvin(FarenheitVersCelcius(fahrenheit)); // Conversion de Fahrenheit à Kelvin
    }
    
    
}
