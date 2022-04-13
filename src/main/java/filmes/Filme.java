/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filmes;

/**
 *
 * @author Rafael Ferrari
 */
public class Filme {
    private String nome;
    private Genero genero;
    private String link;

    public Filme(String nome, Genero genero){
        this.nome = nome;
        this.genero= genero;     
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   

    
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    public void likeMovies(){
        
    }
    
      public void recomendarFilmes(){
        
    }
    
    
}
