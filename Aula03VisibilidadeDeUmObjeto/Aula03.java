package Aula03VisibilidadeDeUmObjeto;

public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
       // c1.ponta =  //metodo privado (ERRO !)
        c1.carga = 80;
        c1.tampada = true;
        c1.status();
    }
}
