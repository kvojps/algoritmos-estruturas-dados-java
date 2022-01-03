package e_FilaPilha;

public class Main {

	public static void main(String[] args) {
		int teste = 1000000;
		PilhaDinamica pilha = new PilhaDinamica();
		FilaDinamica fila = new FilaDinamica();
		MembroEnterprise membro = new MembroEnterprise("Picard", 0);
		
		fila.popular(teste-1);
		System.out.println("Análise da Fila dinâmica : \n");
		System.out.println("Inserindo na fila dinâmica :  " + fila.enqueue(membro));
		System.out.println("Removendo da fila dinâmica: " + fila.dequeue());
		
		System.out.println("---------------------------");
		pilha.popular(teste-1);
		
		System.out.println("Análise da Pilha dinâmica : \n");
		System.out.println("Inserindo na pilha dinâmica :  " + pilha.push(membro));
		System.out.println("Removendo da pilha dinâmica : " + pilha.pop());
		
		// Relatório
		// Aluno : José Ferreira dos Santos Júnior
		/* Observa-se que as operações de pilha dinâmica são bem mais simples e portanto menos custosas quando 
		 * relacionamos com as filas dinâmicas. Mas vale salientar que ambos são dois algoritmos amplamente 
		 * utilizados e importantes. Por exemplo, ao se tratar da construção de um sistema de gerenciamento de 
		 * filas de um banco é mais apropriado utilizar a estrutura de fila dinâmica. Já quando abordamos 
		 * um conceito de  ter o último elemento adicionado (como no comando CTRL + Z) é conveniente utilizar
		 * uma pilha para obtê-lo. Então, para finalizar uma pilha ou fila, quando aplicadas em 
		 * contextos corretos são estruturas interessantes e ágeis.*/
		
	}

}
