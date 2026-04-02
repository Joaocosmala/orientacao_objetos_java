package com.joaocosmala.college.tableregister;

import java.awt.*;
import javax.swing.*;

// Exemplo de cadastro de medicamentos usando Java Swing;
public class CadastroMedicamento {
public static void main(String[] args) {

        JFrame frame = new JFrame("Cadastro de Equipamentos");
        frame.setSize(500,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Campos de entrada
        JPanel painelCampos = new JPanel(new GridLayout(8, 2));

        JLabel lblCode = new JLabel("Código");
        JLabel lblDescription = new JLabel("Descrição");
        JLabel lblModel = new JLabel("Modelo");
        JLabel lblManufacturer = new JLabel("Fabricante");
        JLabel lblDepartment = new JLabel("Departamento");
        JLabel lblValue = new JLabel("Valor");
        JLabel lblAquisitionDate = new JLabel("Data Aquisição");


        JTextField txtCode = new JTextField();
        JTextField txtDescription = new JTextField();
        JTextField txtModel = new JTextField();
        JTextField txtManufacturer = new JTextField();
        JTextField txtDepartment = new JTextField();
        JTextField txtValue = new JTextField();
        JTextField txtAquisitionDate = new JTextField();

        painelCampos.add(lblCode);
        painelCampos.add(txtCode);

        painelCampos.add(lblDescription);
        painelCampos.add(txtDescription);

        painelCampos.add(lblModel);
        painelCampos.add(txtModel);

        painelCampos.add(lblManufacturer);
        painelCampos.add(txtManufacturer);

        painelCampos.add(lblDepartment);
        painelCampos.add(txtDepartment);

        painelCampos.add(lblValue);
        painelCampos.add(txtValue);

        painelCampos.add(lblAquisitionDate);
        painelCampos.add(txtAquisitionDate);

        frame.add(painelCampos, BorderLayout.CENTER);

        // Botoes de ação
        JPanel painelBotoes = new JPanel();

        JButton btnSigin = new JButton("Cadastrar");
        JButton btnClear = new JButton("Limpar");

        painelBotoes.add(btnSigin);
        painelBotoes.add(btnClear);

        frame.add(painelBotoes, BorderLayout.SOUTH);

        frame.setVisible(true);
    };
};
