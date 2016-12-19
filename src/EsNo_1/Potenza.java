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
public class Potenza {
    
    private int base;

    public Potenza(int base) {
        this.base = base;
    }
    
    public void cambiaBase(int base) {
        this.base = base;
    }

    public  void pow(){
        String report="";
        int pot=base*base;
        report="Potenza di 2 del numero: "+pot;
        System.out.println(report);
    }
    
}
