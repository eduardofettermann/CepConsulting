package br.com.ddf.CepConsulting.service;

public class FormatadorDeString {
    public String converteEspacos(String dado) {
        String dadoSemEspacosNosExtremos = dado.trim();
        String dadoConvertido = dadoSemEspacosNosExtremos.replaceAll(" ", "%20");
        return dadoConvertido;
    }

    public String converteNumeros(String dado) {
        return dado.replaceAll("[0-9]+", "");
    }

    public String removeEspacos(String dado) {
        String dadoConvertido = dado.replaceAll("\\D+", "");
        return dadoConvertido;
    }

    public String formataString(String dado){
        FormatadorDeString formatadorDeString = new FormatadorDeString();
        String dadoSemNumeros = formatadorDeString.converteNumeros(dado);
        String dadoConvertido = formatadorDeString.converteEspacos(dadoSemNumeros);
        return dadoConvertido;
    }
}
