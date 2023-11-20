package arvore_Binaria_1;

import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int valores;
        NoArvore noArvore = new NoArvore();

        for (int i = 0; i < 20; i++) {
            valores = random.nextInt(101);
            noArvore = NoArvore.Insere(noArvore, valores);
        }
        System.out.println("Ávore normal:");
        NoArvore.Imp_Ordem(noArvore);
        
        LinkedList<Integer> lista = DSW.transformarArvoreLista(noArvore);
        lista = DSW.RotacoesParaEquilibrar(lista);
        NoArvore arvoreBalanceada = DSW.reconstruirArvore(lista);

        System.out.println("Árvore balanceada:");
        NoArvore.Imp_Ordem(arvoreBalanceada);
    }
}