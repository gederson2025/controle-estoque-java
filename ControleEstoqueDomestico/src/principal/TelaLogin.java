package principal;

import javax.swing.*;
import java.awt.event.*;

public class TelaLogin extends JFrame {
    public TelaLogin() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JTextField txtUsuario = new JTextField(15);
        JPasswordField txtSenha = new JPasswordField(15);
        JButton btnEntrar = new JButton("Entrar");

        panel.add(new JLabel("Usuário:"));
        panel.add(txtUsuario);
        panel.add(new JLabel("Senha:"));
        panel.add(txtSenha);
        panel.add(btnEntrar);

        btnEntrar.addActionListener(e -> {
            new TelaPrincipal();
            dispose();
        });

        add(panel);
        setVisible(true);
    }
}