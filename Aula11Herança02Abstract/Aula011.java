package Aula11Herança02Abstract;

public class Aula011 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Israel");
        v1.setIdade(28);
        v1.setSexo("Masculino");

        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1215);

        System.out.println(a1.toString());
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(777);
        b1.setNome("Jonas");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

        Tecnico t1 = new Tecnico();
        t1.setNome("Joaçaba");
        t1.setIdade(25);
        t1.setSexo("M");
        t1.setRegistroProfissional(787878);
        System.out.println(t1.toString());
    }
}
