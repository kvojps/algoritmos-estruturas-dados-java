package h_InsertionSort;

public class Borg {
	private String identificacao;
	private int registro;
	
	public Borg(String nome, int registro) {
		super();
		this.identificacao = nome;
		this.registro = registro;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	@Override
	public String toString() {
		return "Borg [Identificacao = " + identificacao + ", Registro = " + registro + "]";
	}

}
