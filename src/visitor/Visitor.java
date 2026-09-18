package visitor;

public interface Visitor {
    void visitar(Fisica fisica);
    void visitar(Juridica juridica);
}