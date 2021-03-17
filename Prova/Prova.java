/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova;

/**
 *
 * @author AndreA
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calcolo c = new Calcolo();
        
        Thread thr1 = new Thread(new Runnable()
        {
            public void run()
            {
                for (int i = 0; i < 15; i++) 
                {
                    c.increment();
                }
            }
        });
        
        Thread thr2 = new Thread(new Runnable()
        {
            public void run()
            {
                for (int i = 0; i < 10; i++) 
                {
                    c.decrement();
                }
            }
        });
        
        thr1.run();
        thr2.run();
        
        c.printFinalCounterValue();
        
        /*
        Siccome il nostro Thread agisce sulla stessa variabile,
        sommandola e poi sottraendola mi aspetto che torni 0. Ed infatti mi è tornato 0.
        Se vado a modificare la somma e la metto maggiore del decremento,
        mi torna la differenza tra i due.
        */
        
    }
    
}
