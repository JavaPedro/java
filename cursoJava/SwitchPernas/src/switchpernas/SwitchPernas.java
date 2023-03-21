/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchpernas;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class SwitchPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int pernas = teclado.nextInt();
        String tipo;
        
        System.out.println("Isso é um(a): ");
        switch (pernas){
        case 1: 
            tipo = "saci";
            break;
        case 2:
            tipo = "bipede";
            break;
        case 3: 
            tipo = "tripé";
            break;
        case 4:
            tipo = "quadrupede";
            break;
        case 6:
            tipo = "aranha";
            break;
        default:
            tipo = "ET";
            
    }
        System.out.println(tipo);
    }
    
}
