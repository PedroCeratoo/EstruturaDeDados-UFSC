package ListasSimplesmenteEncadeadas;

public class TestaListaEncadeadaS {

    public static void main(String[] args) {
        ListaEncadeadaS lista = new ListaEncadeadaS();

        lista.insereInicio("Pedro");
        lista.insereInicio("Lara");
        lista.insereInicio("Marcia");
        lista.insereInicio("Marcel");
        lista.imprimeLista();

        lista.removeInicio();
        lista.imprimeLista();

        lista.insereInicio("Lucas");
        lista.insereInicio("Gustavo");
        lista.insereInicio("Fulano");
        lista.insereInicio("Ciclano");
        lista.imprimeLista();
        lista.removeElemento("Marcia");
        lista.imprimeLista();

        lista.removeElemento("Gustavo");
        lista.imprimeLista();

    }


}
