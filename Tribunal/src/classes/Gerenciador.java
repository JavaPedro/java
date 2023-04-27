/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Stack;

/**
 *
 * @author Administrator
 */
public class Gerenciador {
    private Stack<Processos> pilhaProcessos = new Stack<>();
    
    public void adicionarProcesso(Processos processo) {
        pilhaProcessos.push(processo);
    }
    
    public void removerProcesso(Processos processo) {
        pilhaProcessos.remove(processo);
    }
    
    public Processos removerProcesso() {
        return pilhaProcessos.pop();
    }
    
    public Stack<Processos> getPilhaProcessos() {
        return pilhaProcessos;
    }
}
