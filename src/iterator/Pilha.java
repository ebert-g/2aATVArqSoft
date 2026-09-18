package iterator;

public class Pilha implements Iterador {
    private int[] valores = new int[5];
    private int topo = 0;

    public void push(int valor) {
        valores[topo] = valor;
        topo++;
    }

    @Override
    public boolean temProximo() {
        return topo > 0;
    }

    @Override
    public int proximo() {
        topo--;
        return valores[topo];
    }
}