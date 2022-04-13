/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recomendacoes;

import java.time.LocalDate;
import usuarios.Usuario;

/**
 *
 * @author Rafael Ferrari
 */
public class Recomendacao {
    private String titulo;
    private String usuario;

    public Recomendacao(String usuario, String titulo) {
        this.usuario=usuario;
        this.titulo=titulo;
        
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
    
}
