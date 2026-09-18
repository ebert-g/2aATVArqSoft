package visitor;

public class Juridica implements Cliente {
    @Override
    public void aceitar(Visitor visitante) {
        visitante.visitar(this);
    }
}