package Exercicio;


class ContaBancaria {
    private double saldo;
    protected String titular;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public double consultarSaldo() {
        return saldo; // O saldo só pode ser acessado via método público
    }
}


class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    public void verificarAcessibilidade() {

        System.out.println("Titular da conta: " + titular);

        // System.out.println("Saldo da conta: " + saldo);  ERRO! (saldo é private e inacessível diretamente)

        System.out.println("Saldo via método: R$ " + consultarSaldo()); // Correto
    }
}


public class Banco {
    public static void main(String[] args) {
        ContaPoupanca conta = new ContaPoupanca("Caio", 1000);
        conta.depositar(500);
        conta.verificarAcessibilidade();
    }
}
