package ListasLineares.ListasSequenciais;

public class ListaSequenciaisTeste {

    public static void main(String[] args) {
        ListaVetores listaVetoresTeste = new ListaVetores(5);

        listaVetoresTeste.insere(66);
        listaVetoresTeste.insere(77);
        listaVetoresTeste.insere(88);

        listaVetoresTeste.imprime();
        System.out.println(listaVetoresTeste.removeFinal());
        listaVetoresTeste.imprime();
        listaVetoresTeste.insere(333);
        listaVetoresTeste.insere(999);
        listaVetoresTeste.insere(55);
        System.out.println(listaVetoresTeste.removeFinal());
        listaVetoresTeste.imprime();
        System.out.println(listaVetoresTeste.removeFinal());
        listaVetoresTeste.imprime();

        System.out.println(listaVetoresTeste.removeFinal());
        listaVetoresTeste.imprime();

        listaVetoresTeste.insere(22);
        listaVetoresTeste.insere(44);

        listaVetoresTeste.imprime();

    }
}
