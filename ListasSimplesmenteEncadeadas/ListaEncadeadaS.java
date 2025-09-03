package ListasSimplesmenteEncadeadas;

public class ListaEncadeadaS {

    Nodo inicio;

    private class Nodo {
        String nome;
        Nodo proximo;
    }

    public ListaEncadeadaS() {
        inicio = null;
    }

    public void insereInicio(String n) {
        Nodo novo = new Nodo();
        novo.nome = n;
        if (inicio == null) {
            inicio = novo;
        } else {
            novo.proximo = inicio;
            inicio = novo;
        }
    }

    public String removeInicio() {
        if (inicio == null) {
            return null;
        }
        String removido = inicio.nome;
        inicio = inicio.proximo;

        return removido;
    }

    public String removeElemento(String n) {
        Nodo atual = inicio;
        Nodo anterior = null;

        while (atual != null && !atual.nome.equals(n)) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == null) {
            return null;
        }

        if (anterior == null) {
            String retirado = atual.nome;
            inicio = inicio.proximo;
            return retirado;
        }
        String retirado = atual.nome;
        anterior.proximo = atual.proximo;
        return retirado;
    }

    public void imprimeLista() {
        for (Nodo i = inicio; i != null; i = i.proximo) {
            System.out.print(i.nome + " -> ");
        }
        System.out.println();
    }

}

