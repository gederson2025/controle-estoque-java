package principal;

import javax.swing.*;
import java.awt.event.*;

public class TelaPrincipal extends JFrame {
    public TelaPrincipal() {
        setTitle("Menu Principal");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JButton btnProduto = new JButton("Cadastro Produto");
        JButton btnMov = new JButton("Movimentação");
        JButton btnRelatorio = new JButton("Relatório");
        JButton btnSair = new JButton("Sair");

        panel.add(btnProduto);
        panel.add(btnMov);
        panel.add(btnRelatorio);
        panel.add(btnSair);

        btnProduto.addActionListener(e -> new TelaCadastroProduto());
        btnMov.addActionListener(e -> new TelaMovimentacao());
        btnRelatorio.addActionListener(e -> new TelaRelatorio());
        btnSair.addActionListener(e -> System.exit(0));

        add(panel);
        setVisible(true);
    }
}