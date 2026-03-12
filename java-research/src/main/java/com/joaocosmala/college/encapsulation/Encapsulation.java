package main.java.com.joaocosmala.college.encapsulation;

public class Encapsulation {

    // Classe simples
    static class Pessoa {

        // atributos privados (encapsulamento)
        private String nome;
        private int idade;

        // getter do nome
        public String getNome() {
            return nome;
        }

        // setter do nome
        public void setNome(String nome) {
            this.nome = nome;
        }

        // getter da idade
        public int getIdade() {
            return idade;
        }

        // setter da idade
        public void setIdade(int idade) {
            this.idade = idade;
        }
    }

    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        // usando setters para definir valores
        p.setNome("Joao");
        p.setIdade(25);

        // usando getters para acessar valores
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
    };
};
