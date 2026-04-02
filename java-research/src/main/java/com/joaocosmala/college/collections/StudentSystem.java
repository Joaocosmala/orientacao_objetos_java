package com.joaocosmala.college.collections;

import java.util.HashSet;
import java.util.Scanner;

class Student {
    private String name;
    private int registration;

    public Student(String name, int registration) {
        this.name = name;
        this.registration = registration;
    }

    public int getRegistration() {
        return registration;
    }

    public String getName() {
        return name;
    }
}

public class StudentSystem {

    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();
        Scanner dataScanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n1 - Incluir aluno");
            System.out.println("2 - Consultar aluno");
            System.out.println("9 - Sair");
            System.out.print("Escolha: ");
            option = dataScanner.nextInt();
            dataScanner.nextLine();

            if (option == 1) {
                System.out.print("Nome do aluno: ");
                String nome = dataScanner.nextLine();

                System.out.print("Matricula: ");
                int matricula = dataScanner.nextInt();

                Student student = new Student(nome, matricula);
                students.add(student);

                System.out.println("Aluno cadastrado!");

            } else if (option == 2) {
                System.out.print("Digite a matricula para consulta: ");
                int registrationSearch = dataScanner.nextInt();

                boolean findRegistrationData = false;

                for (Student a : students) {
                    if (a.getRegistration() == registrationSearch) {
                        System.out.println("Aluno encontrado: " + a.getName());
                        findRegistrationData = true;
                    }
                }

                if (!findRegistrationData) {
                    System.out.println("Aluno não encontrado.");
                }
            }

        } while (option != 9);

        System.out.println("Sistema encerrado.");
    };
};
