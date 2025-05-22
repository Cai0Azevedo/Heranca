package Exercicio;


class Animal {
    public Animal() {
        System.out.println("Um animal foi criado!");
    }
}


class Cachorro extends Animal {
    public Cachorro() {
        super();
        System.out.println("Um cachorro foi criado!");
    }
}


public class Bichos {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
    }
}
