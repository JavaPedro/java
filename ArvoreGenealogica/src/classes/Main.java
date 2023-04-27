/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando as árvores genealógicas
        Roberta familiaRoberta = new Roberta();
        Gerusa familiaGerusa = new Gerusa();

        // Acessando o ancestral de cada árvore
        Node ancestralRoberta = familiaRoberta.getAncestral();
        Node ancestralGerusa = familiaGerusa.getAncestral();

        // Imprimindo o nome do ancestral de cada árvore
        System.out.println("Ancestral da família de Roberta: " + ancestralRoberta.getNome());
        System.out.println("Ancestral da família de Gerusa: " + ancestralGerusa.getNome());
    }
}
