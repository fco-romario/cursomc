package br.com.romario.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int codio;
	private String descricao;
	
	private EstadoPagamento(int codio, String descricao) {
		this.codio = codio;
		this.descricao = descricao;
	}

	public int getCodio() {
		return codio;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for(EstadoPagamento x: EstadoPagamento.values()) {
			if(codigo.equals(x.getCodio())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + codigo);
	}
}
