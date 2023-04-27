/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Administrator
 */
public class Roberta {
    private Node ancestral;

    public Roberta() {
        ancestral = new Node("Palmeirinha");
        Node avoMae = new Node("Avo Mae");
        Node mae = new Node("Mae");
        Node roberta = new Node("Roberta");
        ancestral.setFilhoEsquerda(avoMae);
        ancestral.setFilhoDireita(null);
        avoMae.setFilhoEsquerda(null);
        avoMae.setFilhoDireita(mae);
        mae.setFilhoEsquerda(roberta);
        mae.setFilhoDireita(null);
    }

    public Node getAncestral() {
        return ancestral;
    }
}
