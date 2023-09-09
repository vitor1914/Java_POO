package Aula14ProjetoYouTube;

public class Aula14ProjetoYouTube {
    public static void main(String[] args) {
        Video v [] = new Video[3];

        v[0] = new Video("Aula Palmeiras");
        v[1] = new Video("Aula bahia");
        v[2] = new Video("Aula cruzeiro");

      // System.out.println(v[0].toString());

        Gafanhoto g [] = new Gafanhoto[2];
       g[0] = new Gafanhoto("Jubileu", 22, "M", "JONAS");
        g[1] = new Gafanhoto("Rebeca", 45, "M", "vitor");

      //  System.out.println(g[0].toString());

        Visualizacao vis [] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);

        vis[0].avaliar(89.1f);

        System.out.println(vis.toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[0].toString());
    }
}
