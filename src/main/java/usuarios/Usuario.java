/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import filmes.Filme;
import filmes.Genero;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import recomendacoes.Recomendacao;


/**
 *
 * @author Rafael Ferrari
 */
public class Usuario {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String endereco;
    private Recomendacao recomendacao;
    private LocalDate dataRecomendacao;
    private Boolean pagamento;
    
    private List <Filme> avaliados= new ArrayList<>();
    private List<Genero> assistidos = new ArrayList<>();
    
    
    public Usuario(String nome, String sobrenome){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.pagamento=false;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public Recomendacao getRecomendacao() {
        return recomendacao;
    }

    public void setRecomendacao(Recomendacao recomendacao) {
        this.recomendacao = recomendacao;
    }

    public List<Genero> getAssistidos() {
        return assistidos;
    }

    public void setAssistidos(List<Genero> assistidos) {
        this.assistidos = assistidos;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    public void avaliar(Filme filme){   
        boolean achou = false;
        for (Filme f : avaliados) {
            if (f.getNome().equalsIgnoreCase(filme.getNome())){
                avaliados.remove(f);
                achou = true;
                break;
            }           
        }
        if (!achou) {
            avaliados.add(filme);
        }
    }
    
    public void indicar(Filme filme, Usuario usuario){
          System.out.println("Ola "+ usuario.getNome()+" o filme " + filme.getNome()+ " foi te recomendado.");      
    }

    public Boolean getPagamento() {
        return pagamento;
    }

    public void setPagamento(Boolean pagamento) {
        this.pagamento = pagamento;
    }

    public List<Filme> getAvaliados() {
        return avaliados;
    }

    public void setAvaliados(List<Filme> avaliados) {
        this.avaliados = avaliados;
    }
    public void recomendar(String nomeFilme){
        LocalDate dataAtual = LocalDate.now();
        
        
        if(this.dataRecomendacao.equals(null)) {    
            this.dataRecomendacao= dataAtual;
            this.recomendacao = new Recomendacao(this.nome, nomeFilme);
        }
        if(ChronoUnit.DAYS.between(this.dataRecomendacao, dataAtual)>30){
             this.dataRecomendacao= dataAtual;
            this.recomendacao = new Recomendacao(this.nome, nomeFilme);
        }else{
            System.out.println("Voce ainda nao pode recomendar um novo filme!!");
        }
        
    }
    
    public void assistir(Filme filme){
       if (this.pagamento == true){ 
       this.assistidos.add(filme.getGenero());
       }else{
           System.out.println("Pagamento Pendente!!");
       }
    }
    public void pagar(){
        this.pagamento= true;
    }
}
