package br.com.ddf.CepConsulting.service;

import br.com.ddf.CepConsulting.model.DadosCep;

import java.util.Scanner;

public class MenuInicial {
    Scanner leitura = new Scanner(System.in);
    FormatadorDeString formatadorDeString = new FormatadorDeString();

    public DadosCep escolheCepOuEndereco() {
        System.out.println("Escolha uma opção!" + "\r\n" +
                "Você sabe seu CEP?" + "\r\n" +
                "1 - Eu sei o CEP" + "\r\n" +
                "2 - Eu não sei o CEP" + "\r\n" +
                "3 - Sair");

        String resposta = leitura.nextLine();
        String respostaConvertida = formatadorDeString.removeEspacos(resposta);
        if (respostaConvertida.equals("1")) {
            MenuComCep menuComCep = new MenuComCep();
            DadosCep endereco = menuComCep.exibeBuscaComCep();
            System.out.println(endereco);
        } else if (respostaConvertida.equals("2")) {
            MenuSemCep menuSemCep = new MenuSemCep();
            menuSemCep.exibeBuscaSemCep();
        } else if (respostaConvertida.equals("3")) {
            System.out.println("Finalizando...");
        } else {
            MenuInicial menu = new MenuInicial();
            menu.escolheCepOuEndereco();
        }
        return null;
    }
}
