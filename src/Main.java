public class Main {
    public static void main(String[] args) {
        ListaInt listaInt = new ListaInt();
        listaInt.insere(3);
        listaInt.insere(2);
        listaInt.insere(1);
        listaInt.print();
        listaInt.remove(2);
        listaInt.print();
        listaInt.remove(3);
        listaInt.insere(4);
        listaInt.insere(5);
        listaInt.print();

    }
}