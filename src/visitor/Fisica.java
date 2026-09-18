package visitor;

public class Fisica implements Cliente {
    @Override
    public void aceitar(Visitor visitante) {
        visitante.visitar(this);
    }
}