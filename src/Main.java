import br.com.dio.desafio.BootCamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Bootcamp");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Kotlin");
        curso2.setDescricao("Bootcamp");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setTitulo("Mentoria dem Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria em kotlin");
        mentoria2.setTitulo("Mentoria dem Java");
        mentoria2.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Java");
        bootCamp.setDescricao("Java intermediario");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Teste");
        dev.inscreverBootCampo(bootCamp);
        System.out.println(dev.getNome()+dev.getConteudosIncritos());




    }
}