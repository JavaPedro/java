/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota do Aluno: ");
        float nota = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.format("A nota de %s e %.1f: \n",nome, nota);
    }
    
}
