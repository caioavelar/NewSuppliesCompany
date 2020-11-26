package br.newtonpaiva.dominio;

import java.util.List;
import java.util.ArrayList;

public class Categoria {

  private String nome;
  private List<Produto> produtos = new ArrayList<>();

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Produto> geProdutos() {
    return this.produtos;
  }
  
  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }
}