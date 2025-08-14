

#    private Integer[] dados;
    private Integer quantidade;

     ListaVetores(Integer tamanho) {
        dados = new Integer[tamanho];
        quantidade = 0;
    }

<img src="i<img width="1413" height="378" alt="image" src="https://github.com/user-attachments/assets/73cf1241-e037-4e31-b8ce-e74d608b5c31" />
" alt="Descrição" width="300">

    void insere(int valor) {

         if (quantidade == dados.length) {
             resize(dados.length * 2);
         }
             dados[quantidade] = valor;
             quantidade++;
    }
<img src="i<img width="1413" height="378" alt="image" src="<img width="1151" height="262" alt="image" src="https://github.com/user-attachments/assets/23a74467-3e6b-428c-8766-435fd6df7ed6" />
" />
" alt="Descrição" width="300">


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

<img src="i<img width="1413" height="378" alt="image" src="<img width="1151" height="262" alt="image" src="<img width="1553" height="488" alt="image" src="https://github.com/user-attachments/assets/d6a66f87-c605-4768-b193-8ad992611c47" />
" />
" />
" alt="Descrição" width="300">


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

<img src="i<img width="1413" height="378" alt="image" src="<img width="1151" height="262" alt="image" src="<img width="1553" height="488" alt="image" src="<img width="1505" height="535" alt="image" src="https://github.com/user-attachments/assets/847dfebb-4d88-4960-b4ca-3830301ddb12" />
" />

    void resize(int max) {
         Integer temp[] = new Integer[max];
         for (int i = 0; i < quantidade; i++) {
             temp[i] = dados[i];
             dados = temp;
         }
    }


<img src="i<img width="1413" height="378" alt="image" src="<img width="1151" height="262" alt="image" src="<img width="1553" height="488" alt="image" src="<img width="1505" height="535" alt="image" src="<img width="1236" height="240" alt="image" src="https://github.com/user-attachments/assets/4ee1cd85-00e8-483e-be52-1d63e873ccc7" />
" />
" />

          void imprime() {
          System.out.println("tamanho: " + dados.length);
        for (int i = 0; i < quantidade; i++) {
            System.out.print(dados[i] + " -> ");
        }
        System.out.println();
    }


<img src="i<img width="1413" height="378" alt="image" src="<img width="1151" height="262" alt="image" src="<img width="1553" height="488" alt="image" src="<img width="1505" height="535" alt="image" src="<img width="1236" height="240" alt="image" src="<img width="1167" height="351" alt="image" src="https://github.com/user-attachments/assets/63f0f2cf-0047-451b-b41a-c4cd5a6b5344" />
" />
" />
" />


