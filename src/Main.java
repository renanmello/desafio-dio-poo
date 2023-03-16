import br.dio.desafio.dominio.Bootcamp;
import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Dev;
import br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //criando curso 1
        Curso curso1 = new Curso();
        curso1.setTitulo("java");
        curso1.setDescricao("Curso java 11");
        curso1.setCargaHoraria(8);
        //criando curso 2
        Curso curso2 = new Curso();
        curso2.setTitulo("python");
        curso2.setDescricao("Curso Python");
        curso2.setCargaHoraria(4);
        //criando mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("mentoria de java");
        mentoria.setData(LocalDate.now());

        //testes
        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        //criando bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java + Python");
        bootcamp.setDescricao(" bootcamp POO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //criando os devs
        Dev devrenan = new Dev();
        devrenan.setNome("renan");
        devrenan.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos renan: "+devrenan.getConteudosInscritos());
        System.out.println("Conteudos concluidos renan: "+devrenan.getConteudosConcluidos());
        System.out.println("XP: "+ devrenan.calcularXp());

        Dev devcami = new Dev();
        devcami.setNome("camila");
        devcami.inscreverBootcamp(bootcamp);

        //testando os resultados
        System.out.println("Conteudos inscritos camila: "+devcami.getConteudosInscritos());
        System.out.println("Conteudos concluidos camila: "+devcami.getConteudosConcluidos());
        devcami.progredir();
        devcami.progredir();
        System.out.println("XP: "+ devcami.calcularXp());

    }
}