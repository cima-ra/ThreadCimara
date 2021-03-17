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
public class Calcolo {
    
    int a = 0;
    
    public void increment()
    {
        a++;
    }
    
    public void decrement()
    {
        a--;
    }
    
    void printFinalCounterValue()
    {
        System.out.println("Counter is: " + a);
    }
    
}
