package Exercicio.Aula;


class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ".");
    }
}


class Professor extends Pessoa {
    public Professor(String nome) {
        super(nome);
    }

    public void darAula() {
        System.out.println("O professor " + nome + " está dando aula.");
    }
}


public class Aula {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Caio");
        pessoa.apresentar();

        Professor professor = new Professor("Aryel");
        professor.apresentar();
        professor.darAula();
    }
}
