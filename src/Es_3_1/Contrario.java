/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Es_3_1;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Contrario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner kb=new Scanner(System.in);
        
        System.out.print("Inserisci una frase: ");
        String frase=kb.nextLine();
        
        String frase2="";
        for(int i=frase.length()-1;i>=0;i--){
            frase2+=frase.charAt(i);
        }
        System.out.println("Frase al contrario: "+frase2);
        
    }
    
}
