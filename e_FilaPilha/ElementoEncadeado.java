package e_FilaPilha;

public class ElementoEncadeado {
	private MembroEnterprise oficial;
	private ElementoEncadeado proximo;
	
	public ElementoEncadeado(MembroEnterprise oficial) {
		super();
		this.oficial = oficial;
	}
	
	public MembroEnterprise getOficial() {
		return oficial;
	}

	public void setOficial(MembroEnterprise oficial) {
		this.oficial = oficial;
	}

	public ElementoEncadeado getProximo() {
		return proximo;
	}

	public void setProximo(ElementoEncadeado proximo) {
		this.proximo = proximo;
	}	 
}
