package principal;

import javax.swing.*;
import java.util.ArrayList;
import modelo.Produto;

public class TelaCadastroProduto extends JFrame {
    private static ArrayList<Produto> lista = new ArrayList<>();

    public TelaCadastroProduto() {
        setTitle("Cadastro de Produto");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JTextField nome = new JTextField(15);
        JTextField categoria = new JTextField(15);
        JTextField quantidade = new JTextField(5);
        JButton btnCadastrar = new JButton("Cadastrar");

        panel.add(new JLabel("Nome:"));
        panel.add(nome);
        panel.add(new JLabel("Categoria:"));
        panel.add(categoria);
        panel.add(new JLabel("Quantidade:"));
        panel.add(quantidade);
        panel.add(btnCadastrar);

        btnCadastrar.addActionListener(e -> {
            Produto p = new Produto(nome.getText(), categoria.getText(), Integer.parseInt(quantidade.getText()));
            lista.add(p);
            JOptionPane.showMessageDialog(this, "Produto cadastrado!");
        });

        add(panel);
        setVisible(true);
    }

    public static ArrayList<Produto> getListaProdutos() {
        return lista;
    }
}