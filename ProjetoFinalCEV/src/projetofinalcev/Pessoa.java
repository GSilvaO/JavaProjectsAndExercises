
package projetofinalcev;


public abstract class Pessoa 
{
    // Atributos
    
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    
    
    public Pessoa(String nome, int idade, String sexo)
    {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
    
    
    // Métodos Getters e Setters
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }
    
    public String getSexo()
    {
        return this.sexo;
    }
    
    public void setExpeciencia(float experiencia)
    {
        this.experiencia = experiencia;
    }
    
    public float getExperiencia()
    {
        return this.experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + 
                ", experiencia=" + experiencia + '}';
    }
    
    
}
  
