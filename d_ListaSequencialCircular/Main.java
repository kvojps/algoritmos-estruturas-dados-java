package d_ListaSequencialCircular;

public class Main {

	public static void main(String[] args) {
		int teste = 20000;
		// O pc não demora pra realizar mais que 20k de teste.
		ListaSequencialCircular lsc = new ListaSequencialCircular();
		OficialEstelar oficial = new OficialEstelar("Data", 0);
		
		System.out.println("Análise da lista sequencial circular : \n");
		System.out.println("Testes com listas vazias : \n");
		System.out.println("Inserção no início / Lista vazia: " + lsc.inserirNoInicio(oficial));
		lsc = new ListaSequencialCircular();
		System.out.println("Inserção no fim / Lista vazia: " + lsc.inserirNoFinal(oficial));
		System.out.println("---------------------------");
		System.out.println("Testes com listas cheias : \n");
		lsc = new ListaSequencialCircular();
		lsc.popular(teste - 1);
		System.out.println("Inserção no início / Lista cheia: " + lsc.inserirNoInicio(oficial));
		lsc = new ListaSequencialCircular();
		lsc.popular(teste - 1);
		System.out.println("Inserção no final / Lista cheia: " + lsc.inserirNoFinal(oficial));
		lsc = new ListaSequencialCircular();
		lsc.popular(teste - 1);
		System.out.println("Inserção no meio / Lista cheia: " + lsc.inserirNoMeio(oficial, teste/2));
		
		// Relatório
		// Aluno : José Ferreira dos Santos Júnior
		/*Observa-se que na lista sequencial circular o tempo menor é nas operações de inserir
		 * no início de e fim de uma lista vazia. Já o tempo maior é quando deseja 
		 * executar as operações de inserção em uma lista cheia.
		 * Diante disso, é perceptível que a iteração presentes nas operações de inicio, meio e fim
		 * por percorrerem partes significativas da lista, acabam sendo mais custosas.*/
	}

}