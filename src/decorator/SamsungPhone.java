package decorator;

public class SamsungPhone extends CelularDecorator {

    public SamsungPhone(Celular celular) {
        super(celular);
    }

    @Override
    public String getInfo() {
        return celular.getInfo() + " | 32gb";
    }

    @Override
    public double valor() {
        return celular.valor() + 100;
    }
}
