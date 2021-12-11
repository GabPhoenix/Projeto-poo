package poo;

public class Produtos {
	private String nomeDoProduto;
	private double preco;
	private int quantidade;
	
	public Produtos(String nomeDoProduto, double preco, int quantidade) {
		this.nomeDoProduto = nomeDoProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
