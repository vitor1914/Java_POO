package Aula12PolimorfismoAnimais;

public class Aula012 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();

        Cachorro c = new Cachorro();
        Cobra c1 = new Cobra();
        Canguru c2 =new Canguru();

        c2.locomover();
        c.locomover();
        c.emitirSom();

    }
}
