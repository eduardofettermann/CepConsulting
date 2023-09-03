package br.com.ddf.CepConsulting;
import br.com.ddf.CepConsulting.service.MenuInicial;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class CepConsultingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CepConsultingApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		MenuInicial menuInicial = new MenuInicial();
		menuInicial.escolheCepOuEndereco();
	}
}
