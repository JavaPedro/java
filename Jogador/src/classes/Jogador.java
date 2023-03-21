package classes;

public class Jogador implements Comparable<Jogador> {
	    private String nome;
	    private String posicao;
	    private double peso;
	    private double altura;
	    private int numCamisa;

	    public String getNome(){
	        return nome;
	    }
	    public void setNome(String nome){
	        this.nome = nome;
	    }
	    //get e set posicao
	    public String getPosicao(){
	        return posicao;
	    }
	    public void setPosicao(String posicao){
	        this.posicao = posicao;
	    }
	    //get e set peso
	    public double getPeso(){
	        return peso;
	    }
	    public void setPeso(double peso){
	        this.peso = peso;
	    } 
	    //get e set altura
	    public double getAltura(){
	        return altura;
	    }
	    public void setAltura(double altura){
	        this.altura = altura;
	    }
	    //get e set numero da camisa
	    public int getNumCamisa(){
	        return numCamisa;
	    }
	    public void setNumCamisa(int numCamisa){
	        this.numCamisa = numCamisa;
	    }
	    //Metodo que imprime os objetos dentro da classe Jogador
	    public void imprimirJogador() {
	        System.out.println("Nome: " + this.nome + " | Posição: " + this.posicao + " | Peso: " + this.peso +
	                           " | Altura: " + this.altura + " | Número da camisa: " + this.numCamisa);
	    }
	    //Implementação do método compareTo() para ordenar jogadores pelo nome
	    @Override
	    public int compareTo(Jogador j) {
	        return this.nome.compareTo(j.getNome());
	    }

}
