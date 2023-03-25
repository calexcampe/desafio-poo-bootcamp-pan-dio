package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
