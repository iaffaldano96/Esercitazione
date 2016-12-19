/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Es_2_1;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class TuttiPositiviPari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //chiedo quanti numeri inserisce
        Scanner kb=new Scanner(System.in);
        System.out.print("Inserisci quanti numeri vuori inserire: ");
        int nmax=kb.nextInt();
        //inserisce i numeri e controllo se rientrano nelle condizioni
        
        boolean allgiusto=true;
        for(int i =0;i<nmax;i++){
            System.out.print("Inserisci numero: ");
            int num=kb.nextInt();
            if(num<0 || num%2!=0)
                allgiusto=false;            
        }
        //verifica finale
        if(allgiusto)
            System.out.println( "Tutti positivi e pari");
        else
            System.out.println("NO");                
    }
    
}
