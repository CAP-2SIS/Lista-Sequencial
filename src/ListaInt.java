public class ListaInt {
    static No lista = null;

    private class No {
        int dado;
        No prox;
    }

    public boolean isEmpty() {
        return lista == null;
    }

    public void insere(int dado) {
        No novo = new No();
        novo.dado = dado;

        if (isEmpty()) {
            lista = novo;
            lista.prox = null;
        } else if (dado < lista.dado) {
            novo.prox = lista;
            lista = novo;
        } else {
            No aux = lista;

            while (aux.prox != null) {
                if (aux.prox.dado < novo.dado) {
                    aux.prox = aux;
                    break;
                }
            }
            novo.prox = aux.prox;
            aux.prox = novo;
        }
    }


    public void print() {
        StringBuilder printer = new StringBuilder();
        printer.append("[");
        No aux = lista;
        while (aux.prox != null) {
            printer.append(aux.dado).append(", ");
            aux = aux.prox;
        }
        printer.append(aux.dado).append("]");
        System.out.println(printer);

    }

}
