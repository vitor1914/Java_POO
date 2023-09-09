package Aula10Encapsulamento01;

public class Professor extends Pessoa {
    private String especilidade;
    private float salario;

    public void receberSalario(float aum){
        this.salario += aum;
    }
    public String getEspecilidade() {
        return especilidade;
    }
}
