package poo;

public class ProdutoNaoExisteExcption extends Exception{
    
    public ProdutoNaoExisteExcption(){
        
    }

    @Override
    public String toString(){
        return "O produto informado não existe";
    }

}
