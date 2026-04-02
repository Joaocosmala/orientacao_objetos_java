package com.joaocosmala.college.equipmentregister;

import java.awt.*;
import javax.swing.*;

public class EquipmentRegister {
    
    public static void main(String[] args) {

        JFrame frame = new JFrame("Cadastro de Equipamentos");
        frame.setSize(450,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Campos de entrada
        JPanel pnlFields = new JPanel(new GridLayout(7, 2));

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

        pnlFields.add(lblCode);
        pnlFields.add(txtCode);

        pnlFields.add(lblDescription);
        pnlFields.add(txtDescription);

        pnlFields.add(lblModel);
        pnlFields.add(txtModel);

        pnlFields.add(lblManufacturer);
        pnlFields.add(txtManufacturer);

        pnlFields.add(lblDepartment);
        pnlFields.add(txtDepartment);

        pnlFields.add(lblValue);
        pnlFields.add(txtValue);

        pnlFields.add(lblAquisitionDate);
        pnlFields.add(txtAquisitionDate);

        frame.add(pnlFields, BorderLayout.CENTER);

        // Botoes de ação
        JPanel pnlButtons = new JPanel();

        JButton btnSignIn = new JButton("Cadastrar");
        JButton btnClear = new JButton("Limpar");

        pnlButtons.add(btnSignIn);
        pnlButtons.add(btnClear);

        frame.add(pnlButtons, BorderLayout.SOUTH);

        frame.setVisible(true);
    };
};
