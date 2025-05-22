package Exercicio;


class Aluno {
    private double nota;

    public Aluno(double nota) {
        this.nota = nota;
    }


    public double getNota() {
        return nota;
    }


    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
        }
    }
}


class Boletim {
    public void verificarNota(Aluno aluno) {

        System.out.println("Nota do aluno via método: " + aluno.getNota());
    }
}


public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(8.5);
        Boletim boletim = new Boletim();
        boletim.verificarNota(aluno);

        aluno.setNota(9.0);
        boletim.verificarNota(aluno);

        aluno.setNota(11.0);
    }
}

