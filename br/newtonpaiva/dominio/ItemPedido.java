package br.newtonpaiva.dominio;

public class ItemPedido {
  
  private Integer quantidade;
  private Double preco;
  private Pedido pedido;
  private Produto produto;

  public Integer getQuantidade() {
    return this.quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public Double getPreco() {
    return this.preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public Pedido getPedido() {
    return this.pedido;
  }

  public void setPedido(Pedido pedido) {
    this.pedido = pedido;
  }

  public Produto getProduto() {
    return this.produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public Double obterTotal() {
    return quantidade * preco;
  }

  public String toString() {
    return getProduto().getNome() + " - "
    + getQuantidade() + " * " + getPreco();
  }
}