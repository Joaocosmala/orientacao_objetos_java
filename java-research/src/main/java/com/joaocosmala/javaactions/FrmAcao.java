package main.java.com.joaocosmala.javaactions;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmAcao extends JFrame implements java.awt.event.ActionListener {
    
    // Passo 1: Declarar
    JTextField txtTexto;
    JLabel lbTexto;
    JButton btnAcao;

    public FrmAcao() {
        setSize(300, 200);
        setLayout(new FlowLayout());

    // Passo 2: Construir
        txtTexto = new JTextField(20);
        lbTexto = new JLabel("Campo:");
        btnAcao = new JButton("Clicar");

    // Passo 3: Adicionar
        add(lbTexto);
        add(txtTexto);
        add(btnAcao);

    // Passo 4: Adicionar o evento (addActionListener recebe um objeto que implementa ActionListener, que é a própria classe FrmAcao)
        btnAcao.addActionListener(this);

        setVisible(true);
    }

    public static void main(String[] args) {
        FrmAcao frm = new FrmAcao();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // actionPerformed é o método que será chamado quando o evento de clique ocorrer
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // Passo 5: Implementar a ação do evento
        String texto = txtTexto.getText();
        lbTexto.setText("Você digitou: " + texto);
    };
}
