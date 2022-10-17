package br.com.fiap.jdbc.model;

public class Produto {

	private int idProduto;
	private String nome;
	private String descricao;
	private int idCategoria;

	public Produto() {
	
	}
	
	public Produto(String nome, String descricao, int idCategoria) {
		this.nome = nome;
		this.descricao = descricao;
		this.idCategoria = idCategoria;
	}

	public Integer getId() {
		return idProduto;
	}

	public void setId(Integer id) {
		this.idProduto = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	

}
