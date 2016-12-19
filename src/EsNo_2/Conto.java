/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EsNo_2;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Conto {
    
    private double saldo;
    private ArrayList<String> listaMovimenti= new ArrayList<String>();

    public Conto(double saldo) {
        this.saldo = saldo;
    }        

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<String> getListaMovimenti() {
        return listaMovimenti;
    }    

    public void versamento(double somma){
        saldo+=somma;
        String ver="Versamento";
        if(listaMovimenti.size()==5)
            listaMovimenti.remove(listaMovimenti.get(0));
        
        listaMovimenti.add(ver);
        
    }
    
    public void prelievo(double somma){
        if(saldo<=0)
            System.out.println("Impossibile prelevare");
        else{
            saldo-=somma;
            String pre="Prelievo";
            if(listaMovimenti.size()==5)
                listaMovimenti.remove(listaMovimenti.get(0));
            listaMovimenti.add(pre);
        }    
            
    }
    
    public String stampa(){
        String report="";
        for(int i=0;i<listaMovimenti.size();i++){
            report+=listaMovimenti.get(i)+"\n";
        }
        return report;
    }
    
}
