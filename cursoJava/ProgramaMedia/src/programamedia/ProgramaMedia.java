/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        float n1, n2, m;
//        
//        System.out.print("Digite sua primeira nota: ");
//        n1 = teclado.nextFloat();
//        System.out.print("Digite sua segunda nota: ");
//        n2 = teclado.nextFloat();
//        m = (n1 + n2)/2;
//        
//        System.out.println("Sua media foi: " + m);
//        if(m>7){
//            System.out.println("Parabéns!!!");
        System.out.println("Digite seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        int idade = 2023 - nasc;
        
        if(idade>=18){
            System.out.println("Maioridade " +"(" +idade +")");
        }
        else{
            System.out.println("Menoridade " + "(" +idade +")");
        }
        }
    }
