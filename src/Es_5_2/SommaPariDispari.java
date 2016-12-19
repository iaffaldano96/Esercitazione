/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Es_5_2;

/**
 *
 * @author tss
 */
public class SommaPariDispari {

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
        
        int sommaPari=0,sommaDispari=0;
        for(int i=0;i<numarray.length;i+=2){
            sommaPari+=numarray[i];
        }
        for(int i=1;i<numarray.length;i+=2){
            sommaDispari+=numarray[i];
        }
        
        System.out.println(controllo(sommaPari, sommaDispari));
    }
    private static String controllo(int num, int num2){
        String report;
        if(num==num2)
            report="Pari e Dispari uguali";
        else
            report="Pari e Dispari diversi";
        return report;
    }
    
}
