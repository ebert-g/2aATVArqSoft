package decorator;

public class CelularBase implements Celular {
    @Override
    public String getInfo() {
        return "Tela 8' ";
    }

    @Override
    public double valor() {
        return 100;
    }
}
