package iterator;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Pilha pilha = new Pilha();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        pilha.push(5);
        pilha.push(4);
        pilha.push(3);
        pilha.push(2);
        pilha.push(1);

        System.out.println("Comparando estruturas (Pilha vs Lista):");

        while (lista.temProximo() && pilha.temProximo()) {
            int valorLista = lista.proximo();
            int valorPilha = pilha.proximo();

            System.out.println(valorPilha + " == " + valorLista + " ? " + (valorPilha == valorLista));
        }
    }
}