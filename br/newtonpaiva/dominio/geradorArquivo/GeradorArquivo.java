package br.newtonpaiva.dominio.geradorArquivo;

import br.newtonpaiva.dominio.*;
import java.io.IOException;
import java.io.FileOutputStream;

public abstract class GeradorArquivo {

  public void gerar(String nomeArquivo, Pedido pedido) throws IOException {
    // Converter Pedido para String
    String conteudo = getConteudo(pedido);

    // Converter String para bytes
    byte[] b = conteudo.getBytes();

    //Gravar o arquivo no disco
    FileOutputStream out = new FileOutputStream(nomeArquivo);
    out.write(b);
    out.close();
  }

  protected abstract String getConteudo(Pedido pedido);
}