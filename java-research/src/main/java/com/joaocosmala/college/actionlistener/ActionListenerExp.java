package main.java.com.joaocosmala.college.actionlistener;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerExp {
    
    public static void main(String[] args) {

        JFrame janela = new JFrame("Exemplo ActionListener");
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton botao = new JButton("Clique aqui");

        // adicionando o ActionListener no botão
        botao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("O botão foi clicado!");
            }

        });

        janela.add(botao);

        janela.setVisible(true);
    }
}