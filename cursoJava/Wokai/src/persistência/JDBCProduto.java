/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistência;

import java.sql.Connection;
import java.util.ArrayList;
import modelo.Produto;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Pichau
 */
public class JDBCProduto {
    
    Connection conexão;

    public JDBCProduto(Connection conexão) {
        this.conexão = conexão;
    }
    
    public void inserirProduto(Produto p) throws java.sql.SQLException{
        String sql = "insert into produto(nome, valor, qntd) values (?, ?, ?)";
        PreparedStatement ps;
        
        try{
            ps = this.conexão.prepareStatement(sql);
            ps.setString(1, p.getNome());
            ps.setDouble(2, p.getValor());
            ps.setInt(3, p.getQntd());
            ps.execute();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Produto> listarProdutos(){
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        String sql = "select * from produto";
        
        try{
            Statement declaração = conexão.createStatement();
            ResultSet resposta = declaração.executeQuery(sql);
            
            while(resposta.next()){
               
                int id = resposta.getInt("id");
                String nome = resposta.getString("nome");
                Double valor = resposta.getDouble("valor");
                int qntd = resposta.getInt("qntd");
                
                 Produto p = new Produto(id, nome, valor, qntd);
                
            }
            
            
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
    
    public void apagarTudo() {
    }
}
