package Aula04MetodosGetterSetterConstrutor;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Amarelo", 0.4f);
        c1.status();

        Caneta c2 = new Caneta("NIC", "Laranja", 1.5f);
        c2.status();
    }
}
