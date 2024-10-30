/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_eysseric1;

/**
 *
 * @author beatr
 */
public class TP2_relation_1_EYSSERIC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio +
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        
         // Ajouter des voitures aux personnes
        bob.ajouterVoiture(uneClio);
        bob.ajouterVoiture(uneMicra);
        reno.ajouterVoiture(une2008);

        // Afficher les voitures et propriétaires
        System.out.println("\nAprès ajout des propriétaires :");
        System.out.println(uneClio);
        System.out.println(une2008);
        System.out.println(uneMicra);
        
        
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1 ;
        uneClio.proprietaire = Bob ;
        
        System.out.println("la premiere voiture de Bob est " +bob.liste_voitures[0] ); 
    }
    
    
    
}




QUESTION 9
