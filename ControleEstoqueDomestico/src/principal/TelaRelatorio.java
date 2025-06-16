package principal;

import javax.swing.*;
import modelo.Produto;

public class TelaRelatorio extends JFrame {
    public TelaRelatorio() {
        setTitle("Relatório");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();
        for (Produto p : TelaCadastroProduto.getListaProdutos()) {
            area.append("Produto: " + p.getNome() + " | Quantidade: " + p.getQuantidade() + "\n");
        }

        add(new JScrollPane(area));
        setVisible(true);
    }
}