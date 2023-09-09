package Aula09RelacionamentoDeClassesLivros;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 22, "F");

        l[0] = new Livro("Aprendendo Java", "Jose da silva", 300, p [0]);
        l[1] = new Livro("Averdea", "maria", 300, p [1]);
        l[2] = new Livro("Java", "bonifacio", 300, p [0]);

        System.out.println(l[1].detalhes());

    }
}
