import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMafe = new Dev();
        devMafe.setNome("Maria Fernanda");
        devMafe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mafe" + devMafe.getConteudosInscritos());

        devMafe.progredir();
        devMafe.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos Mafe" + devMafe.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Mafe" + devMafe.getConteudosConcluidos());
        System.out.println("XP:" + devMafe.calcularTotalXp());

        System.out.println("------");

        Dev devHeloisa = new Dev();
        devHeloisa.setNome("Heloisa");
        devHeloisa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Heloisa" + devHeloisa.getConteudosInscritos());

        devHeloisa.progredir();
        devHeloisa.progredir();
        devHeloisa.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos Heloisa" + devHeloisa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Heloisa" + devHeloisa.getConteudosConcluidos());
        System.out.println("XP:" + devHeloisa.calcularTotalXp());
    }
}
