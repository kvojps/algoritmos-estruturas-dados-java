package h_insertionSort;

public class Main {

	public static void main(String[] args) {
		int quantidade = 10000;
		Ordenacao2 ordem = new Ordenacao2();
		ListaSequencialEstatica3 lse0 = new ListaSequencialEstatica3(quantidade);
		lse0.populate(quantidade - 1);
		System.out.println(lse0.toString());
		
		System.out.println();
		System.out.println("InsertionSort(Pior caso): "+ ordem.insertionSort(lse0));
		System.out.println();
		
		System.out.println(lse0.toString());
		
		System.out.println();
		System.out.println("----------x----------");
		System.out.println();
		
		ListaSequencialEstatica3 lse1 = new ListaSequencialEstatica3(quantidade);
		lse1.populateOrdenado(quantidade - 1);
		System.out.println(lse1.toString());
		
		System.out.println();
		System.out.println("InsertionSort(Melhor caso): " + ordem.insertionSort(lse1));
		System.out.println();
		
		System.out.println(lse1.toString());
		
		// Relatório
		// Aluno : José Ferreira dos Santos Júnior
		/* Observa-se que as operações no insertion sort em uma lista ordenada desde o princípio é menos
		 * custoso em relação a uma lista desordenada. Diante disso, vale ressaltar que a quantidade de 
		 * iterações está totalmente relacionado ao tempo de execução do algoritmo com isso é possível concluir
		 * que quanto maior for a quantidade de itens em uma lista, maior o tempo de execução do programa(Onde 
		 * uma lista desordenada é mais custoso que a lista ordenada).*/

	}

}
