import java.time.LocalDate;

import dominio.Curso;
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
    }
}
