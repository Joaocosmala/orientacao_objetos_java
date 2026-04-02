package main.com.joaocosmala.college.overload;

public class OverloadExp {

    // classe simples
    static class Calculadora {

        // mesma função com dois inteiros
        public int calcular(int a, int b) {
            return a + b;
        }

        // mesma função com três inteiros (quantidade diferente)
        public int calcular(int a, int b, int c) {
            return a + b + c;
        }

        // mesma função com dois números decimais (tipo diferente)
        public double calcular(double a, double b) {
            return a + b;
        }

        // mesma função com ordem de parâmetros diferente
        public void calcular(String nome, int numero) {
            System.out.println(nome + " digitou o número " + numero);
        }

        public void calcular(int numero, String nome) {
            System.out.println("Número: " + numero + " - Nome: " + nome);
        }
    }

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(5, 3));        // dois inteiros
        System.out.println(calc.calcular(5, 3, 2));     // três inteiros
        System.out.println(calc.calcular(2.5, 4.5));    // double

        calc.calcular("Joao", 10);                      // ordem 1
        calc.calcular(20, "Maria");                     // ordem 2
    };
};

// - Sobrecarga (Overload):
// Acontece quando métodos têm o mesmo nome, mas...
//  -- Tipos diferentes de argumentos
//  -- Quantidade diferente
//  -- Ordem diferente

// * (Exemplo: Tipos diferentes):
// ------ ------ ------ ------
// public class Calculadora {
//     public int soma(int a, int b) {
//         return a + b;
//     };

//     public double soma(double a, double b) {
//         return a + b;
//     };
// };

// * (Exemplo: Quantidade diferente):
// ------ ------ ------ ------
// public int soma(int a, int b) {
//     return a + b;
// };

// public int soma(int a, int b, int c) {
//     return a + b + c;
// };

// * (Exemplo: Ordem diferente):
// ------ ------ ------ ------
// public void mostrar(String nome, int idade) {
//     System.out.println(nome + idade);
// };

// public void mostrar(int idade, String nome) {
//     System.out.println(idade + nome);
// };
