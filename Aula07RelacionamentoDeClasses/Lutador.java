package Aula07RelacionamentoDeClasses;

public class Lutador {
    //ATRIBUTO
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private  String categoria;
    private int vitoria, derrota, empates;

    public void apresentar() {
        System.out.println("--------------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " Anos e " + this.getAltura());
        System.out.println("com " + this.getPeso() + "Kg");
        System.out.println(this.getVitoria() + " Vitoria");
        System.out.println(this.getDerrota() + " derrotas e");
        System.out.println(this.getEmpates() + " empates!");

    }
    public void status(){
        System.out.println(this.getNome() + "é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitoria() + "Vezes");
        System.out.println("Perdeu " + this.getDerrota() + "Vezes");
        System.out.println("Empatou " + this.getEmpates() + "Vezes");

    }
    public void ganharLuta(){
          this.setVitoria(this.getVitoria() + 1);
    }
    public void perderLuta(){
          this.setDerrota(this.getDerrota() + 1);
    }
    public void empatarLuta() {
          this.setEmpates(this.getEmpates() + 1);
    }


    //METODOS PUBLICOS

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em ) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitoria = vi;
        this.derrota = de;
        this.empates = em;
    }


    //METODOS ESPECIAIS


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;

    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
                this.categoria = "Pesado";
            } else {
                this.categoria = "Invalido";
            }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
