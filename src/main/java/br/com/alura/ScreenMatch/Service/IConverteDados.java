package br.com.alura.ScreenMatch.Service;

public interface IConverteDados {
    <T> T converterDados(String json, Class<T> tClass);
}
