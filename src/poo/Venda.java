package poo;

public class Venda extends Loja{
    
    public Venda(Cliente cliente, int id, Carrinho carrinho) {
		super(cliente, id, carrinho);
	}
	
    public void vendaRealizada(String nome, int quantidade){
        /*Quando um produto é vendido, diminuímos a quantidade em estoque
        através da quantidade de produtos que o(a) cliente comprou
         */
        for(int i=0; i<carrinho.getProdutos().size(); i++){
            // Verificando o nome do produto;
            if(carrinho.getProdutos().get(i).getNomeDoProduto() == nome){
                carrinho.getProdutos().get(i).setQuantidade(
                    // Atualizando a nova quantidade de produtos
                    carrinho.getProdutos().get(i).getQuantidade()-quantidade
                    );
            }
        }

    }
    
}