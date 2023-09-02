package br.com.ddf.CepConsulting.service;

import br.com.ddf.CepConsulting.model.DadosCep;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuSemCep {
    Scanner scanner = new Scanner(System.in);

    public void exibeBuscaSemCep() {
        System.out.println("""
                Digite sua UF (ex.: RS, SC, SP, RJ): 
                """);

        String estado = scanner.nextLine();

        System.out.println("""
                Digite sua cidade(ex.: Porto Alegre, São Paulo, Rio de Janeiro):
                """);

        String cidade = scanner.nextLine();

        System.out.println("""
                Digite sua rua(ex.: Assis Brasil, Sertorio, Baltazar):
                """);

        String rua = scanner.nextLine();

        System.out.println(
                "Estado escolhido: " + estado + "\r\n" +
                        "Cidade escolhida: " + cidade + "\r\n" +
                        "Rua escolhida: " + rua);

        ConsumoApi consumoApi = new ConsumoApi();
        var json = consumoApi.obterDados(estado, cidade, rua);
        ConverteDados conversor = new ConverteDados();
        ArrayList<DadosCep> arrayDeEnderecos = conversor.converteEmArray(json, ArrayList.class);


        if (arrayDeEnderecos.size() == 1) {
            System.out.println(arrayDeEnderecos.get(0));
        } else {
            System.out.println("Digite o número relacionado a sua rua: ");

            for (int i = 0; i < arrayDeEnderecos.size(); i++) {
                System.out.println(i + 1 + " - " + arrayDeEnderecos.get(i).logradouro() + " - " + arrayDeEnderecos.get(i).bairro());
            }

            int enderecoEscolhido = scanner.nextInt();
            enderecoEscolhido--;

            int i = 0;
            while (i < arrayDeEnderecos.size()) {
                if (enderecoEscolhido != i) {
                    i++;
                } else {
                    System.out.println(arrayDeEnderecos.get(i));
                    break;
                }
            }
        }
    }
}

