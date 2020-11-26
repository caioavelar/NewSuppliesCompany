package br.newtonpaiva.dominio;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import br.newtonpaiva.dominio.imposto.ICMS;

public class Pedido {
  private Integer numero;
  private Date dataCriacao;
  private List<ItemPedido> itens = new ArrayList<>();
  private Endereco enderecoEntrega;
  private Cliente cliente;
  private Frete calculoFrete;
  private ICMS calculoICMS;

  public Pedido(Integer numero) {
    this.numero = numero;
    this.dataCriacao = new Date();
  }

  public Integer getNumero() {
    return this.numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public Date getDataCriacao() {
    return this.dataCriacao;
  }

  public List<ItemPedido> getItens() {
    return itens;
  }

  public void setItens(List<ItemPedido> itens) {
    this.itens = itens;
  }

  public Endereco getEnderecoEntrega() {
    return this.enderecoEntrega;
  }

  public void setEnderecoEntrega(Endereco enderecoEntrega) {
    this.enderecoEntrega = enderecoEntrega;
  }

  public Cliente getCliente() {
    return this.cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public void setCalculoFrete(Frete calculoFrete) {
    this.calculoFrete = calculoFrete;
  }

  public void setCalculoICMS(ICMS calculoICMS) {
    this.calculoICMS = calculoICMS;
  }

  public Double obterTotal() {
    Double total = 0.0;
    for(ItemPedido item : itens) {
      total += item.obterTotal() * calculoICMS.getDecimalICMS();
    }
    
    total = total + calculoFrete.getFrete();


    return total;
  }

  
  public String toString() {
    return getNumero() + " - " + getCliente().getNome() + " - " + getItens().toString();
  }

}