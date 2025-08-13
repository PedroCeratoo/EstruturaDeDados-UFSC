package ListasLineares.ListasSequenciais;

public  class ListaVetores {

    private Integer[] dados;
    private Integer quantidade;

     ListaVetores(Integer tamanho) {
        dados = new Integer[tamanho];
        quantidade = 0;
    }

    void insere(int valor) {

         if (quantidade == dados.length) {
             resize(dados.length * 2);
         }
             dados[quantidade] = valor;
             quantidade++;
    }

    Integer removeFinal() {
        if (quantidade == 0) {
            return null;
        }
        else {
            Integer temp = dados[quantidade - 1];
            quantidade--;

            if (quantidade > 0 && quantidade == dados.length/4) {
                resize(dados.length/2);
            }
            return temp;
        }
    }

    Integer removePosicao(int posicao) {
         if (posicao < 0 || posicao >= quantidade) {
             return null;
         }
         else {
             Integer temp = dados[posicao];

             for (int i = posicao + 1; i < quantidade; i++) {
                 dados[i - 1] = dados[i];
             }
             quantidade--;
             return temp;
         }
    }

    void resize(int max) {
         Integer temp[] = new Integer[max];
         for (int i = 0; i < quantidade; i++) {
             temp[i] = dados[i];
             dados = temp;
         }
    }

      void imprime() {
          System.out.println("tamanho: " + dados.length);
        for (int i = 0; i < quantidade; i++) {
            System.out.print(dados[i] + " -> ");
        }
        System.out.println();
    }

}
