package decorator;

public class Main {
    public static void main(String[] args) {
        Celular celular  = new CelularBase();

        System.out.println("Celular Base");
        System.out.println(celular.getInfo() + "\n" + celular.valor());

        celular = new SamsungPhone(celular);
        System.out.println("Samsung Phone");
        System.out.println(celular.getInfo() + "\n" + celular.valor());

        celular  = new AppleIphone(celular);
        System.out.println("Apple Iphone");
        System.out.println(celular.getInfo() + "\n" + celular.valor());
    }
}
