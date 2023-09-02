package br.com.ddf.CepConsulting.service;

import br.com.ddf.CepConsulting.model.DadosCep;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<DadosCep> converteEmArray(String json, Class<ArrayList> classe) {

        try {
            ArrayList<DadosCep> arrayDeJson = mapper.readValue(json, new TypeReference<ArrayList<DadosCep>>() {
            });
            ArrayList<DadosCep> listaDeCeps = new ArrayList<DadosCep>();

            for (DadosCep cepAtual : arrayDeJson) {
                listaDeCeps.add(cepAtual);
            }
            return listaDeCeps;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
