/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuovaProva;

/**
 *
 * @author informatica
 */
public class NuovaProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contatore c1 = new Contatore(true);
        Contatore c2 = new Contatore(false);
        
        c1.start();
        c2.start();
        
        System.out.println("c1 = " + c1.getContatore());
        System.out.println("c2 = " + c2.getContatore());
    }
    
}
