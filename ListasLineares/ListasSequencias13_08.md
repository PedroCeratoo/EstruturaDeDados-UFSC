

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
<img width="829" height="422" alt="image" src="https://github.com/user-attachments/assets/82e65fac-2198-48c3-b82f-adbd5b82975a" />



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
<img width="874" height="390" alt="image" src="https://github.com/user-attachments/assets/33a0cc17-81eb-44b6-b96f-fd3d0ebb285f" />


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
<img width="849" height="622" alt="image" src="https://github.com/user-attachments/assets/cfc0bdf8-bdad-49ef-aff4-0c60da58d804" />



    void resize(int max) {
         Integer temp[] = new Integer[max];
         for (int i = 0; i < quantidade; i++) {
             temp[i] = dados[i];
         }
             dados = temp;
    }

![Método resize](https://github.com/user-attachments/assets/d855d0b0-4bde-4213-8278-7c2d55ca13f2)
<img width="475" height="640" alt="image" src="https://github.com/user-attachments/assets/26cb8f42-a4d9-4d59-ae77-bf7567a2dd06" />



        void imprime() {
        System.out.println("tamanho: " + dados.length);
        for (int i = 0; i < quantidade; i++) {
            System.out.print(dados[i] + " -> ");
        }
        System.out.println();
    }

![Método imprime](https://github.com/user-attachments/assets/63f0f2cf-0047-451b-b41a-c4cd5a6b5344)

