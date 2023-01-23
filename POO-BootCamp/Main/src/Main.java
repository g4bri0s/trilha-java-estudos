import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Spring Boot");
        curso1.setDescricao("Descricao do Curso Spring Boot");
        curso1.setCargaHoraria(5);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Projeto para portifolio");
        mentoria1.setDescricao("Descricao do Projeto para portifolio");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Java + Spring Boot");
        bootcamp1.setDescricao("Descricao do Bootcamp");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Dev1");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos incritos:" + dev1.getConteudosInscritos());

        Dev dev2 = new Dev();
        dev2.setNome("Dev2");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos incritos:" + dev2.getConteudosInscritos());

    }
}
