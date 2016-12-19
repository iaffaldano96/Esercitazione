/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EsNo_4;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Coda {
    
    private ArrayList<Integer> coda= new ArrayList<Integer>(5);

    public  void aggElemento(int num){
        if(coda.size()==5)
            System.out.println("La coda è piena!");
        else
            coda.add(num);
    }
    
    public void togliElemento(){
        if(coda.size()==0)
            System.out.println("La coda è vuota!");
        else
            coda.remove(coda.get(0));        
    }
    
    public String stampa(){
        String report="";
        for(int i=0;i<coda.size();i++){
            report+=coda.get(i)+"\n";
        }
        return report;
    }
    
    
}
