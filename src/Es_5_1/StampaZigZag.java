/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Es_5_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tss
 */
public class StampaZigZag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numarray[]=new int[10];
        for(int i=0;i<numarray.length;i++){            
            int num =(int)(Math.random()*100+1);
            numarray[i]=num;
        } 
        System.out.println(stampa(numarray));
        
    }
    
    private static String stampa(int numarray[]){
        String report="";
        int j=0;
        for(int i=(numarray.length-1);i>5;i--){
                report+=numarray[j]+"\n"+numarray[i]+"\n";
                j++;
        }      
        return report;
    }

}
