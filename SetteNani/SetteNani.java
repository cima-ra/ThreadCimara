/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetteNani;

/**
 *
 * @author AndreA
 */
public class SetteNani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread thr1 = new ContaNani("Brontolo");
        Thread thr2 = new ContaNani("Cucciolo");
        Thread thr3 = new ContaNani("Dotto");
        Thread thr4 = new ContaNani("Eolo");
        Thread thr5 = new ContaNani("Gondolo");
        Thread thr6 = new ContaNani("Mammolo");
        Thread thr7 = new ContaNani("Pisolo");
        
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
        thr6.start();
        thr7.start();
    }
    
}
