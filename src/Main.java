import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //--------------------------------------------------------------------------------------------------

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.setCor("Branco");
        devGuilherme.setIdade(21);
        devGuilherme.increverBootcamp(bootcamp);

        System.out.println(devGuilherme.getNome() + " possui " + devGuilherme.getIdade() + " anos e é " + devGuilherme.getCor());

        System.out.println("Conteúdos Inscritos de Guilherme: " + devGuilherme.getConteudosInscritos());

        devGuilherme.progredir();

        devGuilherme.progredir();

        devGuilherme.progredir();

        System.out.println("Conteúdos Inscritos de Guilherme: " + devGuilherme.getConteudosInscritos());

        System.out.println("Conteúdos Concluidos de Guilherme: " + devGuilherme.getCouteudosConcluidos());

        System.out.println("XP: " + devGuilherme.calcularTotalXp());


        System.out.println("-----------------------------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.increverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos de Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos de Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Camila: " + devCamila.getCouteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }
}