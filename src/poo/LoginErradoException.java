package poo;

public class LoginErradoException extends Exception{
    private String usuario;
    private String senha;

    public LoginErradoException(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public String toString(){
        return "Login " + usuario + senha + " errada.";
    }
}
