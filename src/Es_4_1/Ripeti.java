/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Es_4_1;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Ripeti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase=inserisciFrase("Inserisci una frase: ");
        int numfrasi=inserisciNumero("Inserisci il numero di quante volte ripeti la frase: ");
        controlloNumero(numfrasi);
        System.out.println(stampa(frase, numfrasi));
        
    }

    private static String inserisciFrase(String frase) {
        Scanner kb=new Scanner(System.in);  
        System.out.print(frase);
        String frase2=kb.nextLine();  
        return frase2;
    }

    private static int inserisciNumero(String frase) {
        Scanner kb=new Scanner(System.in); 
        System.out.print(frase);
        int nmax=kb.nextInt();        
        return nmax;
    }
    
    private static void controlloNumero(int num) {
        if(num<0)
            System.out.println("ERRORE: numero negativo");
        
    }
    
    private static String stampa(String frase,int num) {
        String ripetizioni="";
        for(int i=0;i<num;i++){
            ripetizioni+=frase+"\n";
        }    
        return ripetizioni;
    }
    
}
