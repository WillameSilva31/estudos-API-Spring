package br.com.alura.ScreenMatch.Model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record dadosAPI(@JsonAlias("title") String titulo, @JsonAlias("body") String desc) {
}
