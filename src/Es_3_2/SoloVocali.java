/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Es_3_2;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class SoloVocali {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner kb=new Scanner(System.in);
        
        System.out.print("Inserisci una frase: ");
        String frase=kb.nextLine();
        
        String frase2="";
        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i)==('a') || frase.charAt(i)==('e') || frase.charAt(i)==('i') || frase.charAt(i)==('o') || frase.charAt(i)==('u'))
                frase2+=frase.charAt(i);
        }
   
        System.out.println("Vocali della frase: "+frase2);
        
    }
    
}
