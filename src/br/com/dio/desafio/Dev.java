package br.com.dio.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private final Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
    private final Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootCampo(BootCamp bootCamp) {

        this.conteudosIncritos.addAll(bootCamp.getConteudos());
        bootCamp.getDevs().add(this);
    }

    public void progredir() {

        Optional<Conteudo> conteudoFirst = this.conteudosIncritos.stream().findFirst();
        conteudoFirst.ifPresent(this.conteudosConcluidos::add);
        this.conteudosIncritos.remove(conteudoFirst.get());
    }

    public double calcularXp() {

        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIncritos, dev.conteudosIncritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIncritos, conteudosConcluidos);
    }
}
