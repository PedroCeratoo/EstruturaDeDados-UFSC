package ListasSimplesmenteEncadeadas;

public class ListaEncadeada {

    private Nodo inicio;

    private class Nodo {
        Integer dado;
        Nodo prox;
    }

    ListaEncadeada() {
        inicio = null;
    }

    void insereNodo(Integer valor) {
        Nodo novo = new Nodo();
        novo.dado = valor;
        novo.prox = inicio;
        inicio = novo;
    }

    public Integer retiraInicio() {
        if (inicio == null) {
            return null;
        }
        else {
            Integer temp = inicio.dado;
            inicio = inicio.prox;
            return temp;
        }
    }

    void imprimeLista() {
        for (Nodo temp = inicio; temp != null; temp = temp.prox) {
            System.out.print(temp.dado + "->");
        }
        System.out.println();
    }

    Integer retiraNodo(Integer n) {
        Nodo temp = inicio;
        Nodo anterior = null;

        while (temp != null && temp.dado != n) {
            anterior = temp;
            temp = temp.prox;
        }
        if (temp == null) {
            return null;
        }
        if (anterior == null) {
            int retirado = inicio.dado;
            inicio = inicio.prox;
            return retirado;
        }

        Integer d = temp.dado;
        anterior.prox = temp.prox;
        return d;
    }

    void inserdeOrdenado(Integer n) {

        Nodo temp = inicio;
        Nodo anterior = null;

        while (temp != null && temp.dado < n) {
            anterior = temp;
            temp = temp.prox;
        }

        Nodo novo = new Nodo();
        novo.dado = n;

        if (anterior == null) {
            novo.prox = inicio;
            inicio = novo;
        }
        else {
            anterior.prox = novo;
            novo.prox = temp;
        }

    }

    void imprimeRev() {
        imprimeListaReversa(inicio);
        System.out.println();
    }

    void imprimeListaReversa(Nodo atual) {
        if (atual != null) {
            imprimeListaReversa(atual.prox);
            System.out.print(atual.dado + "->");
        }
    }
}

