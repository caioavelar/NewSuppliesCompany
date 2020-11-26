package br.newtonpaiva.dominio;

public class Endereco {
  private String uf;
  private String cidade;
  private String bairro;
  private String cep;
  private String logradouro;
  private String numero;
  private String complemento;

  public Endereco(String uf, String cidade, String bairro, String cep, String logradouro, String numero, String complemento) {
    this.uf = uf;
    this.cidade = cidade;
    this.bairro = bairro;
    this.cep = cep;
    this.logradouro = logradouro;
    this.numero = numero;
    this.complemento = complemento;
  }

  public Endereco(String uf, String cidade, String bairro, String cep, String logradouro, String numero) {
    this(uf, cidade, bairro, cep, logradouro, numero, null);
  }

  public String getUf() {
    return this.uf;
  }

  public String  getCidade() {
    return this.cidade;
  }

  public String  getBairro() {
    return this.bairro;
  }

  public String  getCep() {
    return this.cep;
  }

  public String  getLogradouro() {
    return this.logradouro;
  }

  public String  getNumero() {
    return this.numero;
  }

  public String  getComplemento() {
    return this.complemento;
  }
}