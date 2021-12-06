package poo;

public class Cliente {
    private String nome, cpf;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome =nome; 
    }
    
    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf; 
    }


}