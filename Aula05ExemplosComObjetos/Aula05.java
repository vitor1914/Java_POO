package Aula05ExemplosComObjetos;

public class Aula05 {
    public static void main(String[] args) {
          ContaBanco p1 = new ContaBanco();
          p1.setNumConta(777);
          p1.setDono("Israel");
          p1.abrirConta("CC");
          p1.depositar(500.03f);

          ContaBanco p2 = new ContaBanco();
          p2.setNumConta(29291);
          p2.setDono("Maria");
          p2.abrirConta("CP");
          p2.depositar(150.03f);
          p2.sacar(1500.45f);

          p1.estadoAtual();
          p2.estadoAtual();



    }
}
