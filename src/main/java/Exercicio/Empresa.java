package Exercicio;


class Funcionario {
    protected double salarioBase;

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}


class Gerente extends Funcionario {
    public Gerente(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.5;
    }
}


public class Empresa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(3000);
        System.out.println("Salário do funcionário: R$ " + funcionario.calcularSalario());

        Funcionario gerente = new Gerente(3000);
        System.out.println("Salário do gerente: R$ " + gerente.calcularSalario());
    }
}
