package br.com.alura.ScreenMatch.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DataConsumeAPI {
    public static String obterDados (String endereco) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder()
                .uri( URI.create(endereco))
                .build();

        HttpResponse<String> res = null;

        try {
            res = client.send(req, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e){
            throw new RuntimeException(e);
        }

        String json = res.body();
        return json;
    }
}
