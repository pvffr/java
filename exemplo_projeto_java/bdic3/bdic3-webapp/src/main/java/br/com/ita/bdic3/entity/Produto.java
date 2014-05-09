package br.com.ita.bdic3.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prod_id")
	private Long id;
	
	@Column(name = "prod_nome")
	private String nome;
	
	@Column(name = "prod_preco_normal")
	private BigDecimal precoNormal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPrecoNormal() {
		return precoNormal;
	}

	public void setPrecoNormal(BigDecimal precoNormal) {
		this.precoNormal = precoNormal;
	}
}
