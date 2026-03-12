package main.java.com.joaocosmala.college.tableregister;

import java.awt.*;
import javax.swing.*;

public class CadastroMedicamento {
public static void main(String[] args) {

        JFrame frame = new JFrame("Cadastro de Medicamentos");
        frame.setSize(500,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Campos de entrada
        JPanel painelCampos = new JPanel(new GridLayout(4,2));

        JLabel lblNome = new JLabel("Nome do Medicamento");
        JLabel lblPrincipio = new JLabel("Princípio Ativo");
        JLabel lblDosagem = new JLabel("Dosagem");
        JLabel lblValidade = new JLabel("Data de Validade");

        JTextField txtNome = new JTextField();
        JTextField txtPrincipio = new JTextField();
        JTextField txtDosagem = new JTextField();
        JTextField txtValidade = new JTextField();

        painelCampos.add(lblNome);
        painelCampos.add(txtNome);

        painelCampos.add(lblPrincipio);
        painelCampos.add(txtPrincipio);

        painelCampos.add(lblDosagem);
        painelCampos.add(txtDosagem);

        painelCampos.add(lblValidade);
        painelCampos.add(txtValidade);

        frame.add(painelCampos, BorderLayout.CENTER);

        // Botoes de ação
        JPanel painelBotoes = new JPanel();

        JButton btnIncluir = new JButton("Incluir");
        JButton btnExcluir = new JButton("Excluir");
        JButton btnEditar = new JButton("Editar");
        JButton btnSair = new JButton("Sair");

        painelBotoes.add(btnIncluir);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnEditar);
        painelBotoes.add(btnSair);

        frame.add(painelBotoes, BorderLayout.SOUTH);

        frame.setVisible(true);
    };
};
