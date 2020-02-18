package projetofinalcev;


public class ProjetoFinalCEV 
{

    
    public static void main(String[] args) 
    {
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 1");
        v[1] = new Video("Aula 2");
        v[2] = new Video("Aula 3");
        
       
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Gerovanda", 11, "F", "gevinha3434");
        g[1] = new Gafanhoto("Gerovando", 19, "M", "vando6565");
        
        Visualizacao vis[] = new Visualizacao [5];
        
        vis[0] = new Visualizacao(g[0], v[2]); // Gerovanda assiste aula 3
        vis[0].avaliar(8);
        vis[2] = new Visualizacao(g[1], v[2]); // Gerovando assiste aula 3
        vis[2].avaliar(4);
        System.out.println(vis[2].toString()); /* Como Gerovando e Gerovanda assistiram
                                                  a mesma aula, e um deu uma avaliação 8
                                                  e o outro uma availiação 4, a avaliação
                                                  desta aula(aula 3) irá aparecer como 6
                                                  pois o programa irá somar as duas avaliações
                                                  e dividir pelo número de visualizações */
        
        vis[1] = new Visualizacao(g[0], v[1]); // Gerovanda assiste aula 2
        vis[1].avaliar(90.0f);
        System.out.println(vis[1].toString());
        
        
        /* v[1].play();
        v[1].like();
        System.out.println(v[0].toString());
        
        System.out.println(v[1].toString());
        g0.viuMaisUm();
        g0.viuMaisUm();
        
        
        System.out.println(g0.toString());
        System.out.println(g1.toString()); */
                
    }
    
}
