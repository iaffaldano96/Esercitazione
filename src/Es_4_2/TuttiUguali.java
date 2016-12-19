/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Es_4_2;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class TuttiUguali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        int num=inserisciNumero("Inserisci numero: ");
        int num2=inserisciNumero("Inserisci numero: ");
        int num3=inserisciNumero("Inserisci numero: ");
        
        String report;
        if(controlloNumero(num, num2, num3))
            report="Tutti uguali";
        else
            report="Almeno uno è diverso";
        System.out.print(report);
    }
    
    private static int inserisciNumero(String frase) {
        Scanner kb=new Scanner(System.in); 
        System.out.print(frase);
        int num=kb.nextInt();        
        return num;
    }
    
    private static boolean controlloNumero(int num,int num2, int num3 ) {
        boolean uguali=true;
        if(num!=num2 || num2!=num3 || num2!=num3)
           uguali=false;      
        return uguali;
    }
    
}
