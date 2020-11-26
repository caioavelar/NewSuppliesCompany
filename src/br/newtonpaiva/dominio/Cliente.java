package br.newtonpaiva.dominio;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
  private String nome;
  private String telefone;
  private String dominio;
  private List<Endereco> enderecos = new ArrayList<>();
  private List<Pedido> pedidos = new ArrayList<>();

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getTelefone() {
    return this.telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getDominio() {
    return this.dominio;
  }

  public void setDominio(String dominio) {
    this.dominio = dominio;
  }

  public List<Endereco> getEnderecos() {
    return this.enderecos;
  }

  public void setEnderecos(List<Endereco> enderecos) {
    this.enderecos = enderecos;
  }

  public List<Pedido> getPedidos() {
    return this.pedidos;
  }

  public void setPedidos(List<Pedido> pedidos) {
    this.pedidos = pedidos;
  }
}