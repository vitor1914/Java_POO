package Aula11Herança02Abstract;

public  class Aluno extends Pessoa {              // use final na classe quando ela não quer classe filho
    private int matricula;
    private String curso;
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade " + this.nome); //mudou para protect
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
