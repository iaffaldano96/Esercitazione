/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EsNo_1;

/**
 *
 * @author tss
 */
public class MainPotenza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Potenza p=new Potenza(4);
        p.pow();
        //cambio base
        p.cambiaBase(5);
        System.out.println("Cambio base in 5");
        p.pow();
        
    }
    
}
