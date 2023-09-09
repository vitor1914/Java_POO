package Aula07RelacionamentoDeClasses;

public class Aula07 {
    public static void main(String[] args) {
        Lutador l [] = new Lutador[6];

                l[0]= new Lutador("ISRAEL VITOR", "Brazil", 31, 1.81f, 83.9f, 11, 3, 0);

                l[1]= new Lutador("REIS", "Brazil", 31, 1.81f, 83.9f, 11, 3, 0);

                l[2]= new Lutador("GARAJAU", "Brazil", 31, 1.81f, 83.9f, 11, 3, 0);

                l[3]= new Lutador("TUBINABAS", "Brazil", 31, 1.81f, 83.9f, 11, 3, 0);

                l[4]= new Lutador("GREMEN", "Brazil", 31, 1.81f, 83.9f, 11, 3, 0);

                l[5]= new Lutador("VENUS", "Brazil", 31, 1.81f, 83.9f, 11, 3, 0);


        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[5], l[3]);
        UEC01.lutar();
    }
}
