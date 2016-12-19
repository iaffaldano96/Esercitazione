/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EsNo_3;

/**
 *
 * @author tss
 */
public class DemoPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila p=new Pila();
        
        p.aggElemento(4);
        p.aggElemento(5);
        p.aggElemento(6);
        p.aggElemento(7);
        p.aggElemento(8);
        p.aggElemento(9); //il 9 non lo inserisce perché piena
        
        System.out.println("Elementi nella pila:\n"+p.stampa());
        
        p.togliElemento();//toglie l'8
        System.out.println("Elementi nella piladopo:\n"+p.stampa());
        
    }
    
}
