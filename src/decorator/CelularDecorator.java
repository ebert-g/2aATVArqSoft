package decorator;

abstract public class CelularDecorator implements Celular {
    protected Celular celular;

    public CelularDecorator(Celular celular) {
        this.celular = celular;
    }
}
