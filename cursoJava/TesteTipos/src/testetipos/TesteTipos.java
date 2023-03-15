/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author Pichau
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor); */
        
        String valor = "30.5";
        float preco = Float.parseFloat(valor);
        System.out.printf("O preco e: %.2f\n", preco);
        
    }
    
}
