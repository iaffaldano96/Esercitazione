/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EsNo_3;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Pila {
    
    private ArrayList<Integer> pila= new ArrayList<Integer>(5);

    public  void aggElemento(int num){
        if(pila.size()==5)
            System.out.println("La pila è piena!");
        else
            pila.add(num);
    }
    
    public void togliElemento(){
        if(pila.size()==0)
            System.out.println("La pila è vuota!");
        else
            pila.remove(pila.get(pila.size()-1));       
    }
    
    public String stampa(){
        String report="";
        for(int i=0;i<pila.size();i++){
            report+=pila.get(i)+"\n";
        }
        return report;
    }

    
    /*private int cellalibera() {
        for(int i=0;i<pila.length-1;i++){
            if(pila[i]==0)
                return i;
        }
        return -1;
    }*/
    
}
