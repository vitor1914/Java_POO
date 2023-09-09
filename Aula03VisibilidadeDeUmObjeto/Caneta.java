package Aula03VisibilidadeDeUmObjeto;

public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
    protected int carga;
    protected boolean tampada;

   public void status() {
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("Esta caneta esta com carga? " + this.carga);
    }

   public void rabiscar () {
        if(this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar. ");
        }else {
            System.out.println("Estou rabiscando");
        }

    }
   protected void tampar() {
        this.tampada = true;

    }
   protected void destampar () {
        this.tampada = false;
    }
}

