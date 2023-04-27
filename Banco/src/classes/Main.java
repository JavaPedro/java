
package classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> filaN = new LinkedList<>();
        Queue<String> filaP = new LinkedList<>();

        //Preenchendo a fila normal com 15 clientes
        for (int i = 1; i <= 15; i++) {
            filaN.add("Normal" + i);
        }

        //Preenchendo a fila preferencial com 5 clientes
        for (int i = 1; i <= 5; i++) {
            filaP.add("Preferencial" + i);
        }

        //Atribuindo senhas aos clientes das filas
        int senhaN = 1;
        int senhaP = 1;
        List<String> atendimento = new ArrayList<>();
        while (!filaP.isEmpty() || !filaN.isEmpty()) {
            // Atende um cliente preferencial a cada 3 clientes normais
            if (!filaP.isEmpty() && atendimento.size() % 4 == 0) {
                String cliente = filaP.poll();
                atendimento.add(cliente + " (Senha " + senhaP + " - Preferencial)");
                System.out.println("Chamando " + cliente + " (Senha " + senhaP + " - Preferencial)");
                senhaP++;
            } else if (!filaN.isEmpty()) {
                String cliente = filaN.poll();
                atendimento.add(cliente + " (Senha " + senhaN + " - Normal)");
                System.out.println("Chamando " + cliente + " (Senha " + senhaN + " - Normal)");
                senhaN++;
            }
        }

        //Imprimindo as filas de atendimento
        System.out.println("\nFila Preferencial:");
        for (String cliente : atendimento) {
            if (cliente.contains("Preferencial")) {
                System.out.println(cliente);
            }
        }

        System.out.println("\nFila Normal:");
        for (String cliente : atendimento) {
            if (cliente.contains("Normal")) {
                System.out.println(cliente);
            }
        }
    }
    
}
