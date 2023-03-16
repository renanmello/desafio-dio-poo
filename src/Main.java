import br.dio.desafio.dominio.Bootcamp;
import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Dev;
import br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //criando curso 1
        Curso curso1 = new Curso("Java","Curso java 11",8);

        //criando curso 2
        Curso curso2 = new Curso("python","Curso Python",4);

        //criando mentoria
        Mentoria mentoria = new Mentoria("Java","mentoria de java",LocalDate.now());

        //testes
        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        //criando bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java + Python"," bootcamp POO");

        bootcamp.addCurso(curso1);
        bootcamp.addCurso(curso2);
        bootcamp.addCurso(mentoria);

        //criando os devs
        Dev devrenan = new Dev("renan");
        devrenan.inscreverBootcamp(bootcamp);

        imprimir(devrenan);

        Dev devcami = new Dev("camila");
        devcami.inscreverBootcamp(bootcamp);

        //testando os resultados
        imprimir(devcami);
        devcami.progredir();
        imprimir(devcami);
        devcami.progredir();


    }

    static void imprimir(Dev dev){

        System.out.println("Nome: "+dev.getNome());
        System.out.println("Conteudos inscritos : "+dev.getConteudosInscritos());
        System.out.println("Conteudos concluidos: "+dev.getConteudosConcluidos());
        System.out.println("XP: "+ dev.calcularXp());


    }
}