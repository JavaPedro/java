/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Administrator
 */
public class Processos {
    private int id;
    private String descricao;
    private String reu;
    private String solicitante;
    
    public Processos(int id, String descricao, String reu, String solicitante) {
        this.id = id;
        this.descricao = descricao;
        this.reu = reu;
        this.solicitante = solicitante;
    }
    
    public int getId() {
        return id;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public String getReu() {
        return reu;
    }
    
    public String getSolicitante() {
        return solicitante;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setReu(String reu) {
        this.reu = reu;
    }
    
    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }
    
    @Override
    public String toString() {
        return "Processo de n°" + id + ": " + descricao + " -|- Réu: " + reu + " -|- Solicitante: " + solicitante;
    }
}
