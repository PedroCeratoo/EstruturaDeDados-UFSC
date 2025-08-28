package ListasSimplesmenteEncadeadas;

import java.util.List;

public class TestaLista {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.imprimeLista();

        lista.insereNodo(5);
        lista.insereNodo(10);
        lista.insereNodo(20);
        lista.insereNodo(25);

        lista.imprimeLista();

        System.out.println("Removeu: " + lista.retiraNodo(25));
        lista.imprimeLista();

        System.out.println("Removeu: " + lista.retiraNodo(200));
        lista.imprimeLista();

        System.out.println("Removeu: " + lista.retiraNodo(10));
        lista.imprimeLista();
    }
}
