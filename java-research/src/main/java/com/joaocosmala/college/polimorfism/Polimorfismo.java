package main.java.com.joaocosmala.college.polimorfism;

public class Polimorfismo {

    // Classe que vai executar as operações matemáticas
    static class OperacaoMatematica { 

        // soma dois números inteiros
        public int somar(int a, int b) {
            return a + b;
        }

        // soma três números ineiros
        public int somar(int a, int b, int c) {
            return a + b + c;
        }

        // soma dois números decimais
        public double somar(double a, double b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        OperacaoMatematica op = new OperacaoMatematica();

        int resultado1 = op.somar(5, 3);
        int resultado2 = op.somar(5, 3, 2);
        double resultado3 = op.somar(2.5, 4.3);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
    };
};
