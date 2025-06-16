package dao;

import conexao.ConexaoBD;
import modelo.Produto;
import java.sql.*;
import java.util.ArrayList;

public class ProdutoDAO {

    public void cadastrarProduto(Produto p) {
        String sql = "INSERT INTO produto (nome, categoria, quantidade, preco) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoBD.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCategoria());
            stmt.setInt(3, p.getQuantidade());
            stmt.setDouble(4, p.getPreco());
            stmt.executeUpdate();
            System.out.println("Produto cadastrado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Produto> listarProdutos() {
        ArrayList<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produto";

        try (Connection conn = ConexaoBD.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setCategoria(rs.getString("categoria"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setPreco(rs.getDouble("preco"));
                lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}