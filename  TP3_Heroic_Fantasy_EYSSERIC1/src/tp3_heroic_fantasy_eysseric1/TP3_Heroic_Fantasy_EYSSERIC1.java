/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_eysseric1;

/**
 *
 * @author beatr
 */
public class TP3_Heroic_Fantasy_EYSSERIC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arme epee1= new Epee("Excalibur",7,5);
        Arme epee2= new Epee ("Durandal",4,7);
        Arme baton1= new Baton ("Chêne", 4, 5);
        Arme baton2= new Baton ("Charme", 5, 6);        
        
                
        System.out.println(epee1);
        System.out.println(epee2);
        System.out.println(baton1);
        System.out.println(baton2);
    }
    
}

