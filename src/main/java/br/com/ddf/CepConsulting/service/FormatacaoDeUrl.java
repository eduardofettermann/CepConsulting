package br.com.ddf.CepConsulting.service;

public class FormatacaoDeUrl {

    public String formataEndereco(String cep) {
        return cep.replaceAll("[^0-9]+", "");
    }

    public String formataEndereco(String estado, String cidade, String rua) {
        FormatadorDeString formatadorDeString = new FormatadorDeString();
        String estadoConvertido = formatadorDeString.formataString(estado);
        String cidadeConvertida = formatadorDeString.formataString(cidade);
        String ruaConvertida = formatadorDeString.formataString(rua);
        return estadoConvertido + "/" + cidadeConvertida + "/" + ruaConvertida;
    }
}
