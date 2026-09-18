package visitor;

public class Main {
    public static void main(String[] args) {
        Cliente pessoa = new Fisica();
        Cliente empresa = new Juridica();

        Visitor mensageiro = new Send();

        pessoa.aceitar(mensageiro);
        empresa.aceitar(mensageiro);
    }
}