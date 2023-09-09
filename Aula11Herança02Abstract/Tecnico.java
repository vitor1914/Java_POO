package Aula11Herança02Abstract;

public class Tecnico extends Aluno{
    protected int registroProfissional;

    public void praticar(){
        System.out.println("Tecnico praticando suas habilidades");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
