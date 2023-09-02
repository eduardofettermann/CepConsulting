package br.com.ddf.CepConsulting.service;

import br.com.ddf.CepConsulting.model.DadosCep;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class MenuComCep {
    public DadosCep exibeBuscaComCep() {
        ObjectMapper mapper = new ObjectMapper();
        ConsumoApi consumoApi = new ConsumoApi();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu CEP: (Ex.: 01001-000)");
        String cep = scanner.nextLine();
        String json = consumoApi.obterDados(cep);

        DadosCep endereco;
        try {
            endereco = mapper.readValue(json, DadosCep.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return endereco;
    }


}
