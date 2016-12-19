/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EsNo_4;

import EsNo_3.Pila;

/**
 *
 * @author tss
 */
public class DemoCoda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coda c=new Coda();
        
        c.aggElemento(4);
        c.aggElemento(5);
        c.aggElemento(6);
        c.aggElemento(7);
        c.aggElemento(8);
        c.aggElemento(9);// il 9 non lo inserisce perché piena
  
        System.out.println("Elementi nella coda:\n"+c.stampa());
        
        c.togliElemento();//toglie il 4
        System.out.println("Elementi nella coda:\n"+c.stampa());
    }
    
}
