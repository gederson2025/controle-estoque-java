package principal;

import modelo.Produto;
import java.util.Date;
import javax.swing.JOptionPane;

public class ControleEstoque {
    public static void main(String[] args) {
        // Protótipo de cadastro de produto
        String nome = JOptionPane.showInputDialog("Nome do produto:");
        String categoria = JOptionPane.showInputDialog("Categoria:");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
        int minQuantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade mínima:"));
        
        // Criando um produto com data atual + 30 dias
        Date validade = new Date(System.currentTimeMillis() + (30L * 24 * 60 * 60 * 1000));
        String obs = JOptionPane.showInputDialog("Observações:");
        
        Produto novoProduto = new Produto(nome, categoria, quantidade, minQuantidade, validade, obs);
        
        // Simulando salvamento no banco de dados
        JOptionPane.showMessageDialog(null, 
            "Produto cadastrado com sucesso!\n" +
            "Nome: " + novoProduto.getNome() + "\n" +
            "Categoria: " + novoProduto.getCategoria() + "\n" +
            "Quantidade: " + novoProduto.getQuantidade() + "\n" +
            "Qtd. Mínima: " + novoProduto.getMinQuantidade());
    }
}