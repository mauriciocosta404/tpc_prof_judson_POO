package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Curso curso1=new Curso();
        Mentoria mentoria1=new Mentoria();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Melhor curso java");
        curso1.setCargaHoraria(8);

        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setDate(LocalDate.now());

        Bootcamp bootcamp=new Bootcamp();
        Dev devMauricio=new Dev();
        Dev devMenezes=new Dev();

        bootcamp.setNome("bootcamp de java developer");
        bootcamp.setDescricao("bootcamp de java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        devMauricio.setNome("Mauricio");
        devMenezes.setNome("Menezes");
        devMauricio.inscreverBootcamp(bootcamp);
        devMenezes.inscreverBootcamp(bootcamp);
        devMauricio.progredir();
        System.out.println("conteudos inscritos"+devMauricio.getConteudosInscritos());
        System.out.println("conteudos inscritos"+devMenezes.getConteudosInscritos());
    }
}
