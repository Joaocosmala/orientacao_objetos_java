package com.joaocosmala.javaswing;

// importa awt[FlowLayout]
// importa swing[JFrame, JButton, JLabel, JTextField]
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClientInterface extends JFrame {
        // 1 - Declarar os componentes da interface gráfica.
        JButton btnCadastrar;
        JTextField txtNome, txtIdade;
        JLabel lblNome, lblIdade;

    public ClientInterface() {
        setTitle("Exemplo de Cadastro");
        setSize(600, 300);
         // [Padrão para java.awt.Panel] Gerenciador de Layout (Atua apenas horizontalmente)
         // Coloca os componentes sequencialmente da esquerda para a direita
        setLayout(new FlowLayout());

        // 2 - Construir o componente da interface gráfica.
        btnCadastrar = new JButton("Cadastrar");
        txtNome = new JTextField(20);
        txtIdade = new JTextField(20);
        lblNome = new JLabel("Nome:");
        lblIdade = new JLabel("Idade:");

        // 3 - Adicionar o componente da interface gráfica o JFrame.
        add(lblNome);
        add(txtNome);
        add(lblIdade);
        add(txtIdade);
        add(btnCadastrar);

        setVisible(true);
        // setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Executa a interface gráfica na thread de eventos.
        ClientInterface frm = new ClientInterface();

        // Configura a operação de fechamento da janela para encerrar o programa.
        // Encerra o processo quando a janela for fechada. Não sobrecarrega.
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}