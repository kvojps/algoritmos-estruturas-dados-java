package a_ListaSequencialEstatica;

public class Main {

	public static void main(String[] args) {
		int teste = 15000;
		
		System.out.println("Análise da lista sequencial estática : \n");
		
		ListaSequencialEstatica lse = new ListaSequencialEstatica(teste);
		FrotaEstelar m1 = new FrotaEstelar("José Ferreira",2);
		System.out.println("Inserção no final / Vazio: " + lse.inserirNoFim(m1));
		
		lse = new ListaSequencialEstatica(teste);
		lse.populate(teste/2);
		System.out.println("Inserção no final / Metade: " + lse.inserirNoFim(m1));
		
		lse = new ListaSequencialEstatica(teste);
		lse.populate(teste - 1);
		System.out.println("Inserção no final / Cheio: " + lse.inserirNoFim(m1));
		
		System.out.println("x--------------------------x");
		
		lse = new ListaSequencialEstatica(teste);
		System.out.println("Inserção no início / Vazio: " + lse.inserirNoComeço(m1));
		
		lse = new ListaSequencialEstatica(teste);
		lse.populate(teste/2);
		System.out.println("Inserção no início / Metade: " + lse.inserirNoComeço(m1));
		
		lse = new ListaSequencialEstatica(teste);
		lse.populate(teste - 1);
		System.out.println("Inserção no início / Cheio: " + lse.inserirNoComeço(m1));
		
		System.out.println("x--------------------------x");
		
		lse = new ListaSequencialEstatica(teste);
		System.out.println("Inserção no Meio / Vazio: Inviável" );
		
		lse = new ListaSequencialEstatica(teste);
		lse.populate(teste/2);
		System.out.println("Inserção no Meio / Metade: " + lse.inserirNoMeio(m1, teste/2));
		
		lse = new ListaSequencialEstatica(teste);
		lse.populate(teste - 1);
		System.out.println("Inserção no Meio / Cheio: " + lse.inserirNoMeio(m1, teste/2));
		
		// Relatório
		// Aluno : José Ferreira dos Santos Júnior
		/*Observa-se que na lista sequencial estática o tempo menor é nas operações de inserir
		 * no final. Já o tempo maior é quando a lista está cheia e são inseridos elementos no
		 * início e meio.*
		 * Diante disso, é perceptível que os laços de iteração presentes nas operações de início
		 * e meio por percorrerem partes significativas da lista, acabam sendo mais custosos.*/		
	}

}