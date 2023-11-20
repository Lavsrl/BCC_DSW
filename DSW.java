package arvore_Binaria_1;

import java.util.LinkedList;

public class DSW {

    public static LinkedList<Integer> transformarArvoreLista(NoArvore arvore) {
        LinkedList<Integer> lista = new LinkedList<>();
        if (arvore != null) {
            lista.addAll(transformarArvoreLista(arvore.esquerda));
            lista.add(arvore.info);
            lista.addAll(transformarArvoreLista(arvore.direita));
        }

        return lista;
    }

    static LinkedList<Integer> RotacoesParaEquilibrar(LinkedList<Integer> lista) {
        LinkedList<Integer> novaLista = new LinkedList<>();
        while (!lista.isEmpty()) {
            if (lista.size() > 1) {
                Integer no1 = lista.removeFirst();
                Integer no2 = lista.removeFirst();
                novaLista.addLast(no2);
                novaLista.addLast(no1);
            } else {
                novaLista.addLast(lista.removeFirst());
            }
        }
        return novaLista;
    }


    public static NoArvore reconstruirArvore(LinkedList<Integer> lista) {
        if (lista.isEmpty()) {
            return null;
        } else {
            Integer raizValor = lista.removeFirst();
            NoArvore arvore = new NoArvore();
            arvore.info = raizValor;

            while (!lista.isEmpty()) {
                Integer valorNo = lista.removeFirst();
                arvore = NoArvore.Insere(arvore, valorNo);
            }

            return arvore;
        }
    }
}