/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack pilha = new Stack();
        
        //Gerando valores aleatórios
        Random random = new Random();
        
        //repetição para adicionar os objetos inteiros na pilha
        for(int i = 0; i<10; i++){
            //Inserindo em pilha objetos aleatórios de 0 a 100
            System.out.println("Inserindo na pilha: " + pilha.push(random.nextInt(100)));
        }
        
        System.out.println("///////////////////////////////////");
        while(!pilha.empty()){
            System.out.println("Retirando da pilha: " + pilha.pop());
        }
    }
    
}
