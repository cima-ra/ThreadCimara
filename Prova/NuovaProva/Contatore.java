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
public class Contatore extends Thread{
    
    boolean incrementa;
    public static int contatore;
    
    public Contatore(boolean incrementa)
    {
        this.incrementa = incrementa;
        contatore = 0;
    }
    
    public Contatore()
    {
        
    }

    public int getContatore() {
        return contatore;
    }
    
    public void run()
    {
        for(int i = 0; i < 1500; i++)
        {
            int tmp = contatore;
            
            if(incrementa)
            {
                contatore = tmp + 1;
            }else
            {
                contatore = tmp - 1;      
            }
        }
    }
}
