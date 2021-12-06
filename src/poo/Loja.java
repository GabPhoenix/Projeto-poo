package poo;

public abstract class Loja implements Util{
    Cliente cliente;
    Carrinho carrinho;
    private int id;

    public Loja(Cliente cliente, int id, Carrinho carrinho){
        this.id = id;
        this.cliente = cliente;
		this.carrinho = carrinho;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

}