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
        Stack<Circulo> pilha = new Stack<>();
        Circulo c1 = new Circulo(12.0);
        Circulo c2 = new Circulo(6.5);
        Circulo c3 = new Circulo(3.7);
        Circulo c4 = new Circulo(32.21);
        Circulo c5 = new Circulo(10.9);
        
        pilha.push(c1);
        pilha.push(c2);
        pilha.push(c3);
        pilha.push(c4);
        pilha.push(c5);
        
        while(!pilha.empty()){
            Circulo circulo = pilha.pop();
            System.out.println("A área do raio do círculo é: " + circulo.getRaio() + " " + circulo.Area());
           
        }
    }
    
}
