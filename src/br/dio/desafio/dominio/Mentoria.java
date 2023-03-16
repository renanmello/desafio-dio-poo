package br.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    public Mentoria(String nome, String descricao, LocalDate data){
        this.setTitulo(nome);
        this.setDescricao(descricao);
        this.setData(data);

    }

    private LocalDate data;



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString(){
        return "Mentoria{ "+
                "Titulo = " + getTitulo() + '\'' +
                ", descrição = "+ getDescricao() +
                ", Data = " + data +
                "}";

    }

}

