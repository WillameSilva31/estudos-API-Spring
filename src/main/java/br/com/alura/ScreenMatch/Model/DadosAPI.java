package br.com.alura.ScreenMatch.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosAPI(@JsonAlias("title") String titulo,
                       @JsonAlias("body") String desc) {
}
