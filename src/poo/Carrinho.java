package poo;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produtos> produtos;

	public Carrinho(ArrayList<Produtos> produtos) {
		this.produtos = produtos;
	}

	public ArrayList<Produtos> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produtos> produtos) {
		this.produtos = produtos;
    }

	public double total() {
		double total = 0;
		for(int i=0; i<produtos.size(); i++) {
			total += produtos.get(i).getPreco();
		}
		return total;
	}
}