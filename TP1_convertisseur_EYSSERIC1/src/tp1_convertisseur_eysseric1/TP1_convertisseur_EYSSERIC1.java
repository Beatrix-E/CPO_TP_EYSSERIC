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
        Scanner scanner = new Scanner(System.in);
        
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
        int choix = scanner.nextInt();
        
        switch (choix) {
            case 1:
                System.out.println(temperature + " degrés Celsius est égal à " + CelciusVersKelvin(temperature) + " degrés Kelvin");
                break;
            case 2:
                System.out.println(temperature + " degrés Kelvin est égal à " + KelvinVersCelcius(temperature) + " degrés Celsius");
                break;
            case 3:
                System.out.println(temperature + " degrés Celsius est égal à " + CelciusVersFahrenheit(temperature) + " degrés Fahrenheit");
                break;
            case 4:
                System.out.println(temperature + " degrés Fahrenheit est égal à " + FahrenheitVersCelcius(temperature) + " degrés Celsius");
                break;
            case 5:
                System.out.println(temperature + " degrés Kelvin est égal à " + KelvinVersFahrenheit(temperature) + " degrés Fahrenheit");
                break;
            case 6:
                System.out.println(temperature + " degrés Fahrenheit est égal à " + FahrenheitVersKelvin(temperature) + " degrés Kelvin");
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
    }

    // Méthode pour convertir Celsius en Kelvin
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15; // Formule de conversion
    }

    // Méthode pour convertir Kelvin en Celsius
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15; // Formule de conversion
    }

    // Méthode pour convertir Celsius en Fahrenheit
    public static double CelciusVersFahrenheit(double tCelcius) {
        return (tCelcius * 9/5) + 32; // Formule de conversion
    }

    // Méthode pour convertir Fahrenheit en Celsius
    public static double FahrenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5/9; // Formule de conversion
    }

    // Méthode pour convertir Kelvin en Fahrenheit
    public static double KelvinVersFahrenheit(double tKelvin) {
        double tCelcius = KelvinVersCelcius(tKelvin); // Conversion de Kelvin à Celsius
        return CelciusVersFahrenheit(tCelcius); // Conversion de Celsius à Fahrenheit
    }

    // Méthode pour convertir Fahrenheit en Kelvin
    public static double FahrenheitVersKelvin(double tFahrenheit) {
        double tCelcius = FahrenheitVersCelcius(tFahrenheit); // Conversion de Fahrenheit à Celsius
        return CelciusVersKelvin(tCelcius); // Conversion de Celsius à Kelvin
    }
}
