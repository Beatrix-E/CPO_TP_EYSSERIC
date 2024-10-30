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
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Voiture uneFiesta = new Voiture("Fiesta", "Ford", 5); // Nouvelle voiture pour Bob
        Voiture uneCivic = new Voiture("Civic", "Honda", 5); // Voiture pour Reno
        Voiture uneTucson = new Voiture("Tucson", "Hyundai", 5); // Autre voiture pour Reno
        
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        // Afficher les voitures disponibles
        System.out.println("Liste des voitures disponibles :");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);
        System.out.println(uneFiesta);
        System.out.println(uneCivic);
        System.out.println(uneTucson);

        // Ajouter des voitures à Bob
        bob.liste_voitures[bob.nbVoitures] = uneClio; // Affecter la Clio à Bob
        bob.nbVoitures++; // Mettre à jour le nombre de voitures de Bob
        uneClio.setProprietaire(bob); // Définir Bob comme propriétaire de la Clio

        bob.liste_voitures[bob.nbVoitures] = uneFiesta; // Ajouter la Fiesta à Bob
        bob.nbVoitures++; // Mettre à jour le nombre de voitures de Bob
        uneFiesta.setProprietaire(bob); // Définir Bob comme propriétaire de la Fiesta

        // Ajouter des voitures à Reno
        reno.liste_voitures[reno.nbVoitures] = une2008; // Affecter la 2008 à Reno
        reno.nbVoitures++; // Mettre à jour le nombre de voitures de Reno
        une2008.setProprietaire(reno); // Définir Reno comme propriétaire de la 2008

        reno.liste_voitures[reno.nbVoitures] = uneCivic; // Ajouter la Civic à Reno
        reno.nbVoitures++; // Mettre à jour le nombre de voitures de Reno
        uneCivic.setProprietaire(reno); // Définir Reno comme propriétaire de la Civic

        // Afficher les voitures de Bob
        System.out.println("\nLes voitures de Bob :");
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println(bob.liste_voitures[i]);
        }

        // Afficher les voitures de Reno
        System.out.println("\nLes voitures de Reno :");
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println(reno.liste_voitures[i]);
        }
    }
}

    
    
    






