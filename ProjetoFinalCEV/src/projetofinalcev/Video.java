
package projetofinalcev;


public class Video implements AcoesVideo
{
    // Atributos
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    
    // Construtor
    
    public Video(String titulo)
    {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    
    // Métodos Getters e Setters
    
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
    
    public void setAvaliacao(int avaliacao)
    {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = nova;
    }
    
    public int getAvaliacao()
    {
        return this.avaliacao;
    }
    
    public void setViews(int views)
    {
        this.views = views;
    }
    
    public int getViews()
    {
        return this.views;
    }
    
    public void setCurtidas(int curtidas)
    {
        this.curtidas = curtidas;
    }
    
    public int getCurtidas()
    {
        return this.curtidas;
    }
    
    public void setReproduzindo(boolean reproduzindo)
    {
        this.reproduzindo = reproduzindo;
    }
    
    public boolean getReproduzindo()
    {
        return this.reproduzindo;
    }

    
    // Métodos abstratos
    @Override
    public void play() 
    {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() 
    {
        this.setReproduzindo(false);
    }

    @Override
    public void like() 
    {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + 
                avaliacao + ", views=" + views + ", curtidas=" + 
                curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
                 
                     
                
    
}
