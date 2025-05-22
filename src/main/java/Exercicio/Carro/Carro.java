package Exercicio.Carro;

public class Carro extends Veiculo {
    @Override
    void mover() {
        super.mover();
        System.out.println("O carro esta mais rapido.");
    }
}