package decorator;

public class AppleIphone extends CelularDecorator {
    public AppleIphone(Celular celular) {
        super(celular);
    }

    @Override
    public String getInfo() {
        return celular.getInfo() + "| Camera 16MP";
    }

    @Override
    public double valor() {
        return celular.valor() + 500 ;
    }
}
