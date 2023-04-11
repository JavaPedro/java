/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class CadastroAluno {
    private Queue<Aluno> fila;
    
    public CadastroAluno(){
        this.fila = new LinkedList<>();
    }
    
    public void AdicionarAluno(Aluno aluno){
        fila.add(aluno);
    }
    
    public void ordemMatricula(){
        Comparator<Aluno> comparator = Comparator.comparingInt(Aluno::getMatricula);
        fila.stream().sorted(comparator);
    }
    
    public void imprimirLista() {
        System.out.println("Lista de Alunos: ");
        for (Aluno aluno : fila) {
            System.out.println("||||||||||||||||||||||||||||||||||||||||");
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("IRA: " + aluno.getIra());
            System.out.println("Curso: " + aluno.getCurso());
        }
    }
   
}
