package br.dio.desafio.dominio;

public class Curso extends Conteudo{


    public Curso(String nome, String descricao, int cargaHoraria) {
        this.setTitulo(nome);
        this.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;

    }

    private int cargaHoraria;



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString(){
        return "Curso{ "+
                "Titulo = " + getTitulo() + '\'' +
                ", descrição = "+ getDescricao() +
                ", carga horaria = " + cargaHoraria +
                "}";

    }

}
