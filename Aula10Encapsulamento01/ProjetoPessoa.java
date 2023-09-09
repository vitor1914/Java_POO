package Aula10Encapsulamento01;

public class ProjetoPessoa {
    public static void main(String[] args) {
      Pessoa p1 = new Pessoa();
      Aluno p2 = new Aluno();
      Professor p3 = new Professor();
      Funcionario p4 = new Funcionario();

      p1.setNome("Pedro");
      p1.setSexo("Masculino");
      p1.setIdade(43);

      p2.setNome("Maria");
      p2.setSexo("Feminino");

      p3.setNome("João");
      p4.setNome("Israel");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
