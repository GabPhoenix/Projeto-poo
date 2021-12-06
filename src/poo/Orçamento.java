package poo;

public class Orçamento extends Loja{

    public Orçamento(Cliente cliente, int id, Carrinho carrinho) {
		super(cliente, id, carrinho);
	}

    // método toString para retornar os dados do orçamento
	@Override
	public String toString() {
		return "Vendas [carrinho=" + carrinho + ", getCliente()=" + getCliente() + ", getCarrinho()=" + getCarrinho()
				+ ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}