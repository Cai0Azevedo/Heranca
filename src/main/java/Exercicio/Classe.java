package Exercicio;

class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }
}

class Alunos extends Pessoa {
    private String matricula;

    public Alunos(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void falar() {
        System.out.println(nome + " (Aluno) está perguntando sobre a aula.");
    }
}

class Professor extends Pessoa {
    protected String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void falar() {
        System.out.println(nome + " (Professor) está explicando a disciplina de " + disciplina + ".");
    }
}

public class Classe {
    public static void main(String[] args) {
        Alunos alunos = new Alunos("Caio", 20, "A12345");
        Professor professor = new Professor("Ana", 40, "Matemática");

        alunos.falar();
        System.out.println("Matrícula do aluno: " + alunos.getMatricula());

        professor.falar();
    }
}
