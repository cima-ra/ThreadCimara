/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProvaRunnable;

/**
 *
 * @author informatica
 */
public class ProvaRunnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        Contatore c1 = new Contatore(true);
        Contatore c2 = new Contatore(false);
        
        Thread thr1 = new Thread(c1);
        Thread thr2 = new Thread(c2);
        
        for (int i = 0; i < 10; i++) {
            thr1.start();
            thr2.start();
        }
        
        thr1.join();
        thr2.join();
        

        System.out.println("Thread 1 = " + c1.getContatore());
        System.out.println("Thread 2 = " + c2.getContatore());

        
        
    }
    
}
