package g_BubbleSort;

public class Main {

	public static void main(String[] args) {
		int teste = 1000;
		ListaSequencialEstatica2 lse =  new ListaSequencialEstatica2(teste);
		lse.populate(teste - 1);
		Ordenacao ordem = new Ordenacao();
	
		System.out.println("Pior caso :" +  ordem.bubbleSort(lse));
		
		ListaSequencialEstatica2 lse2 =  new ListaSequencialEstatica2(teste);
		lse2.populate2(teste - 1);
		System.out.println("Melhor caso :" +  ordem.bubbleSort(lse));
		
		// Relatório
		// Aluno : José Ferreira dos Santos Júnior
		/* Observa-se que as operações no bubble sort em uma lista mais ordenada desde o princípio é menos
		 * custoso em relação a uma lista desordenada. Diante disse, vale ressaltar que a quantidade de 
		 * iterações está totalmente relacionado ao tempo de execução do algoritmo com isso é possível concluir
		 * que quanto maior for a quantidade de itens em uma lista, maior o tempo de execução do programa(Onde 
		 * uma lista desordenada é mais custoso que a lista ordenada).*/
	}

}
