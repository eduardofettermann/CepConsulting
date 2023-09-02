package br.com.ddf.CepConsulting.service;

public interface IConverteDados {
<T> T obterDados(String json,Class<T> classe);
}
