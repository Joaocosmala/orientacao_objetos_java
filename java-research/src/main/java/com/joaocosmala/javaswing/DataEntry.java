package com.joaocosmala.javaswing;

// Importa swing[JOptionPane]
import javax.swing.JOptionPane;

public class DataEntry {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Seja bem vindo ao Swing.");

        // Exemplo de Casting implicito
        String name = JOptionPane.showInputDialog("Informe seu nome: ");
        JOptionPane.showMessageDialog(null, "Seja bem vindo " + name + "!");

        // Exemplo de Casting Explicito
        // (conversão de String para int)
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
        JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
    }
}