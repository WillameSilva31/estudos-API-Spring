package br.com.alura.ScreenMatch;

import br.com.alura.ScreenMatch.Model.DadosAPI;
import br.com.alura.ScreenMatch.Service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static br.com.alura.ScreenMatch.Service.DataConsumeAPI.obterDados;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Primeiro projeto spring sem Web");
		var json = obterDados("https://jsonplaceholder.typicode.com/posts/1");

		ConverteDados converteDados = new ConverteDados();
		DadosAPI dado = converteDados.converterDados(json, DadosAPI.class);
		System.out.println(dado);
	}
}
