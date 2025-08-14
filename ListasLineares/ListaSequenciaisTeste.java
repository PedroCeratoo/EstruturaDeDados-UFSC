package ListasLineares;

public class ListaSequenciaisTeste {

    public static void main(String[] args) {
        ListaVetores listaVetoresTeste = new ListaVetores(3);

        listaVetoresTeste.insere(1);
        listaVetoresTeste.insere(2);
        listaVetoresTeste.imprime();
        listaVetoresTeste.insere(3);
        listaVetoresTeste.imprime();
        listaVetoresTeste.insere(4);
        listaVetoresTeste.imprime();

    }
}
