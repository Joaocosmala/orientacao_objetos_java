package main.com.joaocosmala.javaswing;

// Importa tudo[awt / swing]
import java.awt.*;
import javax.swing.*;

public class ClientLayout extends JFrame {
    // Passo 1
    // --------------------------------- //
    JButton btnCadastrar, btnLimpar;
    JLabel lbCodigo, lbDescricao, lbQuantidade, lbLocalizacao;
    JTextField txtCodigo, txtDescricao, txtQuantidade, txtLocalizacao;
    JPanel pnCampos, pnBotoes;
    
    public ClientLayout() {
        setTitle("Cadastro de Equipamentos");
        setSize(400, 300);

    // Passo 2. Instanciação (Construção)
    // --------------------------------- //
        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");

        lbCodigo = new JLabel("Código");
        lbDescricao = new JLabel("Descrição");
        lbQuantidade = new JLabel("Quantidade");
        lbLocalizacao = new JLabel("Localização");

        txtCodigo = new JTextField(20);
        txtDescricao = new JTextField(20);
        txtQuantidade = new JTextField(20);
        txtLocalizacao = new JTextField(20);

        pnCampos = new JPanel(new FlowLayout());
        pnBotoes = new JPanel(new FlowLayout());

        setLayout(new FlowLayout());

    // Passo 3. Adicionar os componentes em tela
    // --------------------------------- //
        pnCampos.add(lbCodigo);
        pnCampos.add(txtCodigo);
        pnCampos.add(lbDescricao);
        pnCampos.add(txtDescricao);
        pnCampos.add(lbQuantidade);
        pnCampos.add(txtQuantidade);
        pnCampos.add(lbLocalizacao);
        pnCampos.add(txtLocalizacao);

        pnBotoes.add(btnCadastrar);
        pnBotoes.add(btnLimpar);

        add(pnCampos, BorderLayout.CENTER);
        add(pnBotoes, BorderLayout.SOUTH);

        setVisible(true);
        
    }

    public static void main(String[] args) {
        ClientLayout frm = new ClientLayout();

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
