package Aula12PolimorfismoAnimais;

public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Som de ave");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
}
