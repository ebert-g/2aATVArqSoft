package iterator;


public class Lista implements Iterador {
    private int[] valores = new int[5];
    private int tamanho = 0;
    private int posicao = 0;

    public void add(int valor) {
        valores[tamanho] = valor;
        tamanho++;
    }
    @Override
    public boolean temProximo() {
        return posicao < tamanho;
    }

    @Override
    public int proximo() {
        int valor = valores[posicao];
        posicao++;
        return valor;
    }
}