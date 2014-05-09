package br.com.ita.bdic3.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.ita.bdic3.enums.Sexo;

@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = -6199970951870939653L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cli_id")
	private Long id;
	
	@Column(name = "cli_nome")
	private String nome;
	
	@Column(name = "cli_documento")
	private String documento;
	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@Column(name = "cli_nascimento")
	private String datanascimento;
	
	@Column(name = "cli_rg")
	private String rg;
	
	@Column(name = "cli_renda")
	private String renda;
	
	@Column(name = "cli_biometria")
	private String biometria;
	
	@Column(name = "cli_token")
	private String token;
	
	@OneToMany(mappedBy = "cli_id", cascade = CascadeType.ALL)
	private List<EnderecoCliente> enderecos;
	
	@OneToMany(mappedBy = "cli_id", cascade = CascadeType.ALL)
	private List<Telefone> telefones;

	@OneToOne(mappedBy = "cli_id")
	private Usuario usuario;

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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRenda() {
		return renda;
	}

	public void setRenda(String renda) {
		this.renda = renda;
	}

	public String getBiometria() {
		return biometria;
	}

	public void setBiometria(String biometria) {
		this.biometria = biometria;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<EnderecoCliente> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<EnderecoCliente> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}
