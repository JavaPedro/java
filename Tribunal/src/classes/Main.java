/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

import java.util.Scanner;
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
        Gerenciador gerenciador = new Gerenciador();
        Scanner teclado = new Scanner(System.in);
        
        //Adicionar 10 processos
        gerenciador.adicionarProcesso(new Processos(1, "Ação de Divórcio", "Bowser", "Peaches"));
        gerenciador.adicionarProcesso(new Processos(2, "Ação de Cobrança", "SmartFit", "Pedro"));
        gerenciador.adicionarProcesso(new Processos(3, "Ação de Despejo", "Luffy", "Dandan"));
        gerenciador.adicionarProcesso(new Processos(4, "Ação Trabalhista", "Deus", "Jesus"));
        gerenciador.adicionarProcesso(new Processos(5, "Ação de Indenização", "Sharkao", "Esposa do Sharkao"));
        gerenciador.adicionarProcesso(new Processos(6, "Ação Criminal", "Arthur", "Pedro"));
        gerenciador.adicionarProcesso(new Processos(7, "Ação Criminal", "Neymar", "Brasil"));
        gerenciador.adicionarProcesso(new Processos(8, "Ação Criminal", "Bozo", "Brasil"));
        gerenciador.adicionarProcesso(new Processos(9, "Ação Criminal", "Jesus", "Gabriel"));
        gerenciador.adicionarProcesso(new Processos(10, "Ação Criminal", "Mario", "Luigi"));
    
        //Imprimindo a pilha de processos
        Stack<Processos> pilhaProcessos = gerenciador.getPilhaProcessos();
        System.out.println("Pilha de processos:");
        for (Processos processo : pilhaProcessos) {
            System.out.println(processo);
        }
        
        //Removendo um processo
        Processos processoRemovido = gerenciador.removerProcesso();
        System.out.println("Processo removido: " + processoRemovido);
        
        //Imprimindo a pilha de processos atualizada
        pilhaProcessos = gerenciador.getPilhaProcessos();
        System.out.println("Pilha de processos atualizada:");
        for (Processos processo : pilhaProcessos) {
            System.out.println(processo);
        }
        
        //Menu
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar processo");
            System.out.println("2 - Priorizar processo");
            System.out.println("3 - Sair");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o número de identificação do processo:");
                    int id = teclado.nextInt();
                    teclado.nextLine(); // Consumir a quebra de linha após o número
                    System.out.println("Digite a descrição do processo:");
                    String descricao = teclado.nextLine();
                    System.out.println("Digite o nome do réu:");
                    String reu = teclado.nextLine();
                    System.out.println("Digite o nome do solicitante:");
                    String solicitante = teclado.nextLine();
                    gerenciador.adicionarProcesso(new Processos(id, descricao, reu, solicitante));
                    break;
                case 2:
                    if (pilhaProcessos.empty()) {
                        System.out.println("Não há processos para priorizar.");
                    } else {
                        System.out.println("Processos na ordem em que foram armazenados:");
                        for (Processos processo : pilhaProcessos) {
                            System.out.println(processo);
                        }
                        System.out.println("Digite o número de identificação do processo que deve ser priorizado:");
                        int idPrioridade = teclado.nextInt();
                        teclado.nextLine(); // Consumir a quebra de linha após o número
                        boolean processoPriorizado = false;
                        Stack<Processos> pilhaAuxiliar = new Stack<>();
                        while (!pilhaProcessos.empty()) {
                            Processos processo = pilhaProcessos.pop();
                            if (processo.getId() == idPrioridade) {
                                pilhaAuxiliar.push(processo);
                                processoPriorizado = true;
                                break;
                            } else {
                                pilhaAuxiliar.push(processo);
                            }
                        }
                        if (!processoPriorizado) {
                            System.out.println("Processo não encontrado.");
                            while (!pilhaAuxiliar.empty()) {
                                pilhaProcessos.push(pilhaAuxiliar.pop());
                            }
                        } else {
                            while (!pilhaAuxiliar.empty()) {
                                Processos processo = pilhaAuxiliar.pop();
                                if (processo.getId() != idPrioridade) {
                                    pilhaProcessos.push(processo);
                                }
                            }
                            System.out.println("Processo agora está em prioridade.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Fechando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println();
        }
        teclado.close();
    }
    
}
