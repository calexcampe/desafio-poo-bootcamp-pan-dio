package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

    private String nome;
    private String descricao;
    private final LocalDate dataIni = LocalDate.now();
    private final LocalDate dataFim = dataIni.plusDays(30);

    private final Set<Dev> devs = new HashSet<>();
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataIni() {
        return dataIni;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(nome, bootCamp.nome) && Objects.equals(descricao, bootCamp.descricao) && Objects.equals(dataIni, bootCamp.dataIni) && Objects.equals(dataFim, bootCamp.dataFim) && Objects.equals(devs, bootCamp.devs) && Objects.equals(conteudos, bootCamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataIni, dataFim, devs, conteudos);
    }
}
