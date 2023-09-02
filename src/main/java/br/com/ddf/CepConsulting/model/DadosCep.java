package br.com.ddf.CepConsulting.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCep(@JsonAlias("cep") String cep,
@JsonAlias("logradouro") String logradouro,
@JsonAlias("bairro") String bairro,
@JsonAlias("localidade") String cidade,
@JsonAlias("uf")String estado){
    @Override
    public String toString() {
        return  "Cep: " + cep + "\r\n" +
                "Rua: " + logradouro + "\r\n" +
                "Bairro:" + bairro + "\r\n" +
                "Cidade:" + cidade + "\r\n" +
                "Estado: " + estado;
    }
}