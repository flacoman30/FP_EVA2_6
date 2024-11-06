/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_numeros_pares;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA2_6_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int numer1,numer2;
       Scanner captu = new Scanner (System.in);
       System.out.println("inicio");
       numer1 = captu. nextInt (); 
       captu.hasNextLine();
       System.out.println("End");
       numer2 = captu.nextInt();
       captu.nextInt();
        for(int i = numer1;i<=numer2;i++){
            int modelo = i % 2;
            if (modelo == 0)
                continue;
            System.out.print(i+"-");
        
        
        }
        
    }
    
}
