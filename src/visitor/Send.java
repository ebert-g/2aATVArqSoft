package visitor;

public class Send implements Visitor {
    @Override
    public void visitar(Fisica fisica) {
        System.out.println(" SMS para o CPF...");
    }

    @Override
    public void visitar(Juridica juridica) {
        System.out.println("Email  para o cnpj...");
    }
}