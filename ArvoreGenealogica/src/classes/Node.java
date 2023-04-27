/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Administrator
 */
public class Node {
    private String nome;
    private Node parente;
    private Node filhoEsquerda;
    private Node filhoDireita;

    public Node(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setParent(Node parente) {
        this.parente = parente;
    }

    public Node getParente() {
        return parente;
    }

    public void setFilhoEsquerda(Node filhoEsquerda) {
        this.filhoEsquerda = filhoEsquerda;
        if (filhoEsquerda != null) {
            filhoEsquerda.setParent(this);
        }
    }

    public Node getFilhoEsquerda() {
        return filhoEsquerda;
    }

    public void setFilhoDireita(Node filhoDireita) {
        this.filhoDireita = filhoDireita;
        if (filhoDireita != null) {
            filhoDireita.setParent(this);
        }
    }

    public Node getFilhoDireita() {
        return filhoDireita;
    }
}
