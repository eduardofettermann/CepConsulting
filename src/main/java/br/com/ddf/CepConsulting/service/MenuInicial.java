package br.com.ddf.CepConsulting.service;

import br.com.ddf.CepConsulting.model.DadosCep;
import java.util.Scanner;

public class MenuInicial {
    Scanner leitura = new Scanner(System.in);

    public DadosCep escolheCepOuEndereco() {
        System.out.println("Digite 1 ou 2"+ "\r\n" +
                "Você sabe seu CEP?" + "\r\n" +
                "1 - Eu sei o CEP" + "\r\n" +
                "2 - Eu não sei o CEP");

        int resposta = leitura.nextInt();
        if (resposta == 1){
            MenuComCep menuComCep = new MenuComCep();
            DadosCep endereco = menuComCep.exibeBuscaComCep();
            System.out.println(endereco);
        } else if(resposta == 2){
            MenuSemCep menuSemCep = new MenuSemCep();
            menuSemCep.exibeBuscaSemCep();
        }
        return null;
    }
}
