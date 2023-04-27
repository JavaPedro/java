/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Administrator
 */
public class Gerusa {
     private Node ancestral;

    public Gerusa() {
        ancestral = new Node("Bisavo");
        Node avoPai = new Node("Avo Pai");
        Node gerusa = new Node("Gerusa");
        ancestral.setFilhoEsquerda(avoPai);
        ancestral.setFilhoDireita(null);
        avoPai.setFilhoEsquerda(null);
        avoPai.setFilhoDireita(gerusa);
        gerusa.setFilhoEsquerda(null);
        gerusa.setFilhoDireita(null);
    }

    public Node getAncestral() {
        return ancestral;
    }

}
