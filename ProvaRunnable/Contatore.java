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
public class Contatore implements Runnable{
    
    boolean incrementa;
    public static int contatore;
    
    public Contatore(boolean incrementa)
    {
        this.incrementa = incrementa;
        contatore = 0;
    }

    public int getContatore() {
        return contatore;
    }
    
    public void run()
    {   
        if(incrementa)
        {
            contatore++;
        }else
        {
            contatore--;
        }
    }
    
}
