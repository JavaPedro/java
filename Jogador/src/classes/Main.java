package classes;

//import java.util.Collections;
import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Jogador> time = new ArrayList<Jogador>();


        //Usando for ja definindo o tamanho do ArrayList para 11, indice i + 1 para passar pelo jogador em cada laço do for
        for (int i = 0; i < 5; i++) {
            Jogador jogador = new Jogador();
            System.out.print("Digite o nome do jogador " + (i+1) + ": ");
            jogador.setNome(teclado.nextLine());
            System.out.print("Digite a posição do jogador " + (i+1) + ": ");
            jogador.setPosicao(teclado.nextLine());
            System.out.print("Digite o peso do jogador " + (i+1) + ": ");
            jogador.setPeso(Double.parseDouble(teclado.nextLine()));
            System.out.print("Digite a altura do jogador " + (i+1) + ": ");
            jogador.setAltura(Double.parseDouble(teclado.nextLine()));
            System.out.print("Digite o número da camisa do jogador " + (i+1) + ": ");
            jogador.setNumCamisa(Integer.parseInt(teclado.nextLine()));
         
            time.add(jogador);
        }
        
        //Excluindo um jogador pelo nome 
        for(Jogador jogador : time) {
            if(jogador.getNome().equals("Neymar")){
                System.out.println("Sai fora Neymar!");
                time.remove(jogador);
            }
        }
        
        // Removendo o primeiro, o terceiro e o último objetos 
        int[] remove = {0, 2, time.size()-1};
            for (int i = remove.length - 1; i >= 0; i--) {
            int indice = remove[i];
                time.remove(indice);
        }

        
        // Laço for para imprimir todas as informações do time, Get serve para pegar as informações dos objetos
        System.out.println("Jogadores do time:");
        for (Jogador jogador : time) {
            System.out.println("Nome: " + jogador.getNome() + " | Posição: " + jogador.getPosicao() + 
                               " | Peso: " + jogador.getPeso() + " | Altura: " + jogador.getAltura() + 
                               " | Número da camisa: " + jogador.getNumCamisa());
        }
        
        // Esvaziando a lista
        time.clear();

//        // ordenar a lista usando o método criado na classe Jogador
//        Collections.sort(time);
//        System.out.println("Lista ordenada: " + time);
        teclado.close();

	}

}
