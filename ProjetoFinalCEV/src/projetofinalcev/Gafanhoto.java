
package projetofinalcev;


public class Gafanhoto extends Pessoa
{
    // Atributos
    
    private String login;
    private int totAssistido;
    
    
// Construtor herdado
    public Gafanhoto(String nome, int idade, String sexo, String login) 
    {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    
    // Métodos
    
    public void viuMaisUm()
    {
        this.setTotAssistido(this.getTotAssistido() + 1);
    }


    // Métodos Getters e Setters
    
    public void setLogin(String login)
    {
        this.login = login;
    }
    
    public String getLogin()
    {
        return this.login;
    }
    
    public void setTotAssistido(int totAssistido)
    {
        this.totAssistido = totAssistido;
    }
    
    public int getTotAssistido()
    {
        return this.totAssistido;
    }

    
    
    @Override
    public String toString() {
        return "Gafanhoto{"  +  super.toString() +
                "\n login=" + login + ", totAssistido="  + totAssistido + '}';
    } 
    
    
    
}
