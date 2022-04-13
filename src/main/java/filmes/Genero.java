/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package filmes;

/**
 *
 * @author Rafael Ferrari
 */
public enum Genero {
    TERROR(1), AVENTURA(2), MUSICAL(3),FICCAO(4), ROMANCE(5),ANIMACAO(6),HEROI(7);
    
    private int codigo;
    
    Genero (int cod){
        this.codigo = cod;
    }
    
}
