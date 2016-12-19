/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Es_2_2;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class ContinuaFino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner kb=new Scanner(System.in);
        boolean continua=true;
        int somma=0;
        do{
            System.out.print("Inserisci numero: ");
            int num=kb.nextInt();
            somma+=num;
            if(!(num<0 && num%2==0))
                if(!(num>0 && num%3==0)){
                    somma-=num;
                    continua=false;
                }                
        }
        while(continua);
        
        System.out.println("Somma dei numeri: "+somma);
        
    }
    
}
