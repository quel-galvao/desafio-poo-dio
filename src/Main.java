import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso destinado a iniciantes em programação");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("Curso de JS destinado a iniciantes em programação");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Mentoria em Java destinada a iniciantes em programação");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Raquel");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + dev1.getNome() + ":" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + dev1.getNome() + ":" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev1.getNome() + ":" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());

        System.out.println("---------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Carolina");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + dev2.getNome() + ":" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + dev2.getNome() + ":" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev2.getNome() + ":"+ dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());
    }
}
