package Exercicio;


class Boneco {
    protected String nome;
    protected String cor;
    protected Integer forca;


    public Boneco(String nome, String cor, Integer forca) {
        this.nome = nome;
        this.cor = cor;
        this.forca = forca;
    }


    public void falar() {
        System.out.println(nome + " diz: Olá, sou um boneco!");
    }


    public void atacar() {
        System.out.println(nome + " ataca com força " + forca + "!");
    }
}


class Funko extends Boneco {
    private String cabecudo;


    public Funko(String nome, String cor, Integer forca, String cabecudo) {
        super(nome, cor, forca);
        this.cabecudo = cabecudo;
    }


    @Override
    public void falar() {
        System.out.println(nome + " diz: Sou um Funko cabeçudo e estiloso!");
    }


    public void mostrarCaracteristica() {
        System.out.println(nome + " tem um grande cabeça " + cabecudo + ".");
    }
}


public class Bonecos {
    public static void main(String[] args) {
        Boneco boneco = new Boneco("Max Steel", "Verde", 10);
        boneco.falar();
        boneco.atacar();

        Funko funko = new Funko("Batman Funko", "Preto", 15, "desproporcional");
        funko.falar();
        funko.atacar();
        funko.mostrarCaracteristica();
    }
}

