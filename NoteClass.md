Revisão para Atividade Avaliativa

1. Modelagem Conceitual
	* Gap Semântico
	* Modelo de POO
		-Classe : Métodos e Atributos
	
2. Encapsulamento
    * Qualificadores de acesso
	* Padrão Java Beans -- Getters and Setters
	
3. Construção de GUI
	* javax.swing
	* java.awt
	
4. Tratamento de Eventos
	* Polimorfismo
		Sobrecarga
			- Tipos de Argumentos
			- Quantidade de Argumentos
			- Ordem dos Argumentos
	* ActionListener
		Implementa a capacidade de tratarmos ações oriundas da GUI

5. Sobrecarga de Classes
	OperacaoMatematica

====================================================================================

[1. Modelagem Conceitual]:
-------------------
- Gap Semântico:
O Gap Semântico é a diferença entre o mundo real (conceitos do problema) e a representação no sistema (código)
Ou seja, quando criamos classes em POO estamos tentando diminuir essa diferença, representando objetos do mundo real no software.

- Modelo de POO (Classe, Métodos e Atributos):
Na Programação Orientada a Objetos, tudo é organizado em classes;
Uma classe possui: Atributos → características (variáveis) && Métodos → comportamentos (funções)

* (Exemplo):
------ ------ ------ ------
public class Carro {
    // atributos
    String modelo;
    int ano;

    // método
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }
}

* (Uso da classe):
------ ------ ------ ------
Carro c = new Carro();
c.modelo = "Civic";
c.ano = 2022;
c.acelerar();

====================================================================================

[2. Encapsulamento]:
-------------------
- Qualificadores de acesso:
Encapsulamento significa proteger os dados da classe, permitindo acesso apenas de forma controlada.
Isso é feito com qualificadores de acesso.

| Modificador | Acesso                    |
| ----------- | ------------------------- |
| private     | somente na própria classe |
| public      | qualquer lugar            |
| protected   | mesma classe + subclasses |
| default     | mesmo pacote              |

* (Exemplo):
------ ------ ------ ------
public class Pessoa {
    private String nome; // -> Aqui nome não pode ser acessado diretamente fora da classe.
};

- Padrão Java Beans (Getters e Setters):
Para acessar atributos privados, usamos métodos:
get → ler valor
set → modificar valor

* (Exemplo):
------ ------ ------ ------
public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
};

* (Uso da classe):
------ ------ ------ ------
Pessoa p = new Pessoa();
p.setNome("João");
System.out.println(p.getNome());

====================================================================================

[3. Construção de GUI]: (para criar interfaces gráficas em Java, usamos bibliotecas, como as citadas abaixo)
-------------------
- javax.swing: Biblioteca do Java usada para criar interfaces gráficas (GUI) com componentes como janelas, botões, campos de texto e tabelas.
- java.awt: Biblioteca mais antiga do Java que fornece componentes básicos de interface gráfica, layouts, cores e tratamento de eventos.

* (Exemplo):
------ ------ ------ ------
import javax.swing.JFrame;

public class MinhaJanela {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("Minha Janela");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
};

* (Exemplo com botão):
------ ------ ------ ------
import javax.swing.*;

public class Tela {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton botao = new JButton("Clique aqui");

        frame.add(botao);

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
};

====================================================================================

[4. Tratamento de Eventos]: (clicar botão, digitar, mover mouse)
-------------------
Eventos são ações do usuário na interface.
Para tratar eventos usamos listeners.

- Polimorfismo:
Polimorfismo significa muitas formas.
Um método pode ter várias versões diferentes.

- Sobrecarga (Overload):
Acontece quando métodos têm o mesmo nome, mas:
 -- Tipos diferentes de argumentos
 -- Quantidade diferente
 -- Ordem diferente

* (Exemplo: Tipos diferentes):
------ ------ ------ ------
public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    };

    public double soma(double a, double b) {
        return a + b;
    };
};

* (Exemplo: Quantidade diferente):
------ ------ ------ ------
public int soma(int a, int b) {
    return a + b;
};

public int soma(int a, int b, int c) {
    return a + b + c;
};

* (Exemplo: Ordem diferente):
------ ------ ------ ------
public void mostrar(String nome, int idade) {
    System.out.println(nome + idade);
};

public void mostrar(int idade, String nome) {
    System.out.println(idade + nome);
};


- ActionListener:
detecta ações como clique em botão. Quando clicar no botão → executa actionPerformed

* (Exemplo):
------ ------ ------ ------
import javax.swing.*;
import java.awt.event.*;

public class Tela {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton botao = new JButton("Clique");

        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão clicado!");
            }
        });

        frame.add(botao);

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    };
};

====================================================================================

[5. Sobrecarga de Classes — OperacaoMatematica]:
-------------------
Aqui podemos criar uma classe com métodos sobrecarregados.

* (Exemplo):
------ ------ ------ ------
public class OperacaoMatematica {
    public int calcular(int a, int b) {
        return a + b;
    };

    public double calcular(double a, double b) {
        return a + b;
    };

    public int calcular(int a, int b, int c) {
        return a + b + c;
    };
};

* (Uso da classe):
------ ------ ------ ------
OperacaoMatematica op = new OperacaoMatematica();

System.out.println(op.calcular(2,3));
System.out.println(op.calcular(2.5,3.1));
System.out.println(op.calcular(1,2,3));

====================================================================================
====================================================================================

[RESUMO-TEÓRICO]:
Gap Semântico
→ diferença entre o mundo real e a representação no software.

Classe
→ estrutura que contém atributos e métodos.

Encapsulamento
→ proteger dados usando private + getters/setters.

JavaBeans
→ padrão de métodos get e set.

Swing / AWT
→ bibliotecas para interface gráfica.

ActionListener
→ captura eventos da interface (ex: clique).

Polimorfismo
→ métodos com múltiplas formas.

Sobrecarga
→ mesmo método com parâmetros diferentes.