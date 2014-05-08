package br.com.ita.bdic3.enums;

public enum Sexo {
	
	MASCULINO("M"), FEMININO("F");

	private String value;
	
	private Sexo(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
