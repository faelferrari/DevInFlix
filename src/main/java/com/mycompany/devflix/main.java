package com.mycompany.devflix;

import filmes.Filme;
import filmes.Genero;
import usuarios.Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael Ferrari
 */
public class main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Rafael","Ferrari");
        Usuario user2 = new Usuario("Jose","Henrique");
        Usuario user3 = new Usuario("Maria","Angela");
        Usuario user4 = new Usuario("Marcos","Antonio");
        Usuario user5 = new Usuario("Ana","Clara");
        
        Filme filme1 = new Filme("Avengers",Genero.HEROI);
        Filme filme2 = new Filme("Avatar",Genero.FICCAO);
        Filme filme3 = new Filme("Tik Tik Bom",Genero.MUSICAL);
        Filme filme4 = new Filme("O chamado",Genero.TERROR);
        Filme filme5 = new Filme("Encanto",Genero.ANIMACAO);
        Filme filme6 = new Filme("La La Land",Genero.MUSICAL);
        
        user1.avaliar(filme1);        
        user2.avaliar(filme2);
        user3.avaliar(filme3);
        
        
        user4.indicar(filme6, user5);
        user5.recomendar("Homem Aranha");
        
    
    
    }
    
}
