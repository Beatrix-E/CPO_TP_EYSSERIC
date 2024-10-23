/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_eysseric;

/**
 *
 * @author beatr
 */
public class convertisseur {
    int nbConversions;
    public convertisseur() {
        nbConversions = 0;
    }

 
        
    

    // Méthode pour convertir Celsius en Kelvin
    public double CelciusVersKelvin(double tCelcius) {
        nbConversions++;
        return tCelcius + 273.15; // Formule de conversion
    }
     // Méthode pour convertir Kelvin en Celsius
    public double KelvinVersCelcius(double tKelvin) {
        nbConversions++;
        return tKelvin - 273.15; // Formule de conversion
    }
         // Méthode pour convertir Celsius en Fahrenheit
    public double CelciusVersFahrenheit(double tCelcius) {
        nbConversions++;
        return (tCelcius * 9/5) + 32; // Formule de conversion
    }
     // Méthode pour convertir Fahrenheit en Celsius
    public double FahrenheitVersCelcius(double tFahrenheit) {
        nbConversions++;
        return (tFahrenheit - 32) * 5/9; // Formule de conversion
    }
        // Méthode pour convertir Kelvin en Fahrenheit
    public double KelvinVersFahrenheit(double tKelvin) {
        double tCelcius = KelvinVersCelcius(tKelvin); // Conversion de Kelvin à Celsius
        nbConversions++;
        return CelciusVersFahrenheit(tCelcius); // Conversion de Celsius à Fahrenheit
    }
        // Méthode pour convertir Fahrenheit en Kelvin
    public double FahrenheitVersKelvin(double tFahrenheit) {
        double tCelcius = FahrenheitVersCelcius(tFahrenheit); // Conversion de Fahrenheit à Celsius
        nbConversions++;
        return CelciusVersKelvin(tCelcius); // Conversion de Celsius à Kelvin
    }
        

    @Override
    public String toString () {
        return "nb de conversions"+ nbConversions;
    }  

    
}


