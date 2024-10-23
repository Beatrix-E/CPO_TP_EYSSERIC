/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_eysseric;

/**
 *
 * @author beatr
 */
public class TP2_manip_EYSSERIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        
        // Inversion des références
        Tartiflette temp = assiette1; // Stocke la référence de assiette1
        assiette1 = assiette2;        // assiette1 référence maintenant assiette2
        assiette2 = temp;             // assiette2 référence maintenant l'ancienne assiette1
    
        Moussaka[] moussakas = new Moussaka[10];
        
        // Création de 10 objets de type Moussaka
        for (int i = 0; i < moussakas.length; i++) {
            moussakas[i] = new Moussaka(300 + (i * 50)); // Par exemple, 300, 350, 400, etc.
        }
        
        // Affichage des calories de chaque Moussaka
        for (int i = 0; i < moussakas.length; i++) {
            System.out.println("Moussaka " + (i + 1) + " : " + moussakas[i].nbCalories+ " calories");
        }
    
    }
    
    
}
