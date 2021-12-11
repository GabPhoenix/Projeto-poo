package poo;

public class Loja implements Util{
    Cliente cliente;
    private int id;

    public Loja(Cliente cliente, int id){
        this.id = id;
        this.cliente = cliente;
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


}