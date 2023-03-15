/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author Pichau
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Pedro";
        String nome2 = "Pedro";
        String nome3 = new String("Pedro");
        String res;
        // o .equals verifica se o conteudo de um objeto é igual ao conteudo de outro
        res = (nome1.equals(nome3 )) ? "igual":"diferente";
        System.out.println(res);
        
    }
    
}
