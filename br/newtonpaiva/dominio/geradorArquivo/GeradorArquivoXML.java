package br.newtonpaiva.dominio.geradorArquivo;

import br.newtonpaiva.dominio.*;


public class GeradorArquivoXML extends GeradorArquivo {

  protected String getConteudo(Pedido pedido) {
    StringBuilder conteudo = new StringBuilder();

    conteudo.append("<Pedido>");
    conteudo.append(
      String.format("<numero>%d</numero>", pedido.getNumero())
    );
    conteudo.append("</Pedido>");

    return conteudo.toString();
  }

}