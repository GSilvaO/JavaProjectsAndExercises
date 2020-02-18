
package projetofinalcev;


public class Visualizacao 
{
    // Atributos
    
    private Gafanhoto espectador;
    private Video filme;
    
    // Construtor
    
    public Visualizacao(Gafanhoto espectador, Video filme)
    {
        this.filme = filme;
        this.espectador = espectador;
        this.espectador.viuMaisUm();
        this.filme.setViews(this.filme.getViews() + 1);
    }
    

    // Métodos
    
    public void avaliar()
    {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota)
    {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc)
    {
        int tot = 0;
        
        if(porc <= 20)
        {
           tot = 3; 
        }
        else if(porc <= 50)
        {
            tot = 5;
        }
        else if(porc <= 90)
        {
            tot = 8;
        }
        else
        {
            tot = 10;
        }
        
        this.filme.setAvaliacao(tot);
    }
    
    public void setEspectador(Gafanhoto espectador)
    {
        this.espectador = espectador;
    }
    
    public Gafanhoto getEspectador()
    {
        return this.espectador;
    }
    
    public void setFilme(Video filme)
    {
        this.filme = filme;
    }
    
    public Video getFilme()
    {
        return this.filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + 
                ", filme=" + filme + '}';
    }
    
    
    
}
