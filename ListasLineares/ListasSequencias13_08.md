

#    private Integer[] dados;
    private Integer quantidade;

     ListaVetores(Integer tamanho) {
        dados = new Integer[tamanho];
        quantidade = 0;
    }

![Classe ListaVetores](https://github.com/user-attachments/assets/73cf1241-e037-4e31-b8ce-e74d608b5c31)

    void insere(int valor) {

         if (quantidade == dados.length) {
             resize(dados.length * 2);
         }
             dados[quantidade] = valor;
             quantidade++;
    }
![Método Insere](https://github.com/user-attachments/assets/23a74467-3e6b-428c-8766-435fd6df7ed6)


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
}

![Método removeFinal](https://github.com/user-attachments/assets/d6a66f87-c605-4768-b193-8ad992611c47)

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

![Método removePosicao](https://github.com/user-attachments/assets/847dfebb-4d88-4960-b4ca-3830301ddb12)


    void resize(int max) {
         Integer temp[] = new Integer[max];
         for (int i = 0; i < quantidade; i++) {
             temp[i] = dados[i];
         }
             dados = temp;
    }

![Método resize](https://github.com/user-attachments/assets/d855d0b0-4bde-4213-8278-7c2d55ca13f2)


        void imprime() {
        System.out.println("tamanho: " + dados.length);
        for (int i = 0; i < quantidade; i++) {
            System.out.print(dados[i] + " -> ");
        }
        System.out.println();
    }

![Método imprime](https://github.com/user-attachments/assets/63f0f2cf-0047-451b-b41a-c4cd5a6b5344)

