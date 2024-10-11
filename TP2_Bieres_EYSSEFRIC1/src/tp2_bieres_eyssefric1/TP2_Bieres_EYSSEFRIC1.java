/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_eyssefric1;

/**
 *
 * @author beatr
 */
public class TP2_Bieres_EYSSEFRIC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0,"Dubuisson") ;
        uneBiere.lireEtiquette();
        uneBiere.Décapsuler();
        
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
        secondeBiere.lireEtiquette();
        secondeBiere.Décapsuler();
        
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Desperados", 5.9,"Heineken N.V.") ;
        troisiemeBiere.lireEtiquette();
        troisiemeBiere.Décapsuler();
        
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Heineken", 5.0,"Heineken N.V.") ;
        quatriemeBiere.lireEtiquette();
        quatriemeBiere.Décapsuler();
        
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("Corona", 4.6,"Grupo Modelo") ;
        cinquiemeBiere.lireEtiquette();
        cinquiemeBiere.Décapsuler();
        
        System.out.println(uneBiere) ;
        System.out.println(secondeBiere) ;
        System.out.println(troisiemeBiere) ;
        System.out.println(quatriemeBiere) ;
        System.out.println(cinquiemeBiere) ;
   
    }
    
}
