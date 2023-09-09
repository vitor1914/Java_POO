package Aula12PolimorfismoAnimais;

public class Canguru extends  Mamifero {

    @Override      // metodo pra especificar so o canguru "saltando"
    public void locomover() {      //Assinatura

        System.out.println("Saltando");
    }
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }


}
