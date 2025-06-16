package principal;

import javax.swing.*;
import modelo.Produto;
import java.util.ArrayList;

public class TelaMovimentacao extends JFrame {
    public TelaMovimentacao() {
        setTitle("Movimentação de Estoque");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JComboBox<String> produtos = new JComboBox<>();
        for (Produto p : TelaCadastroProduto.getListaProdutos()) {
            produtos.addItem(p.getNome());
        }

        JTextField quantidade = new JTextField(5);
        String[] tipo = {"Entrada", "Saída"};
        JComboBox<String> operacao = new JComboBox<>(tipo);
        JButton btnSalvar = new JButton("Salvar");

        panel.add(new JLabel("Produto:"));
        panel.add(produtos);
        panel.add(new JLabel("Operação:"));
        panel.add(operacao);
        panel.add(new JLabel("Quantidade:"));
        panel.add(quantidade);
        panel.add(btnSalvar);

        btnSalvar.addActionListener(e -> {
            int idx = produtos.getSelectedIndex();
            Produto p = TelaCadastroProduto.getListaProdutos().get(idx);
            int qtd = Integer.parseInt(quantidade.getText());
            if (operacao.getSelectedItem().equals("Entrada")) {
                p.setQuantidade(p.getQuantidade() + qtd);
            } else {
                p.setQuantidade(p.getQuantidade() - qtd);
            }
            JOptionPane.showMessageDialog(this, "Movimentação registrada!");
        });

        add(panel);
        setVisible(true);
    }
}