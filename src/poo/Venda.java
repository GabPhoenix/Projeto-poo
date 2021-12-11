package poo;

import java.util.ArrayList;

public class Venda extends Loja {
	private ArrayList<Produtos> prods;

	public Venda(Cliente cliente, int id, ArrayList<Produtos> prods) {
		super(cliente, id);
		this.prods = prods;
	}

	public ArrayList<Produtos> getProds() {
		return prods;
	}

	public void setProds(ArrayList<Produtos> prods) {
		this.prods = prods;
	}
	
	
}
