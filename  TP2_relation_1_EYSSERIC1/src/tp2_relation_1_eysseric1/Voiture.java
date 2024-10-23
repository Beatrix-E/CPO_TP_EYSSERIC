/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_eysseric1;

/**
 *
 * @author beatr
 */
public class Voiture {
    String nom;
    String marque;
    int age;

    public Voiture(String nom, String marque, int age) {
        this.nom = nom;
        this.marque = marque;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Voiture{" + 
                "nom=" + nom + ","
                + "marque=" + marque 
                + " age=" + age + 
                '}';
    }
    
}
