/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EsNo_2;

/**
 *
 * @author tss
 */
public class GestioneConto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conto cc= new Conto(10.50);
        System.out.println("Saldo iniziale: "+cc.getSaldo());
        
        cc.versamento(10.00);
        System.out.println("Saldo con versamento: "+cc.getSaldo());
        
        cc.prelievo(5.00);
        System.out.println("Saldo con prelievo: "+cc.getSaldo());

        
        System.out.println("Lista movimenti: \n"+cc.stampa());
        
    }
    
}
