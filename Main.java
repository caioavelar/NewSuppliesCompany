import br.newtonpaiva.dominio.*;
import br.newtonpaiva.dominio.frete.*;
import br.newtonpaiva.dominio.imposto.*;
import br.newtonpaiva.dominio.geradorArquivo.*;
class Main {
  public static void main(String[] args) {

    Produto p1 = new Produto();
    p1.setNome("Mouse sem fio");
    p1.setPreco(143.99);

    Produto p2 = new Produto();
    p2.setNome("Notebook Dell");
    p2.setPreco(3543.99);
    
    Cliente c = new Cliente();
    c.setNome("Caio");

    Pedido p = new PedidoBuilder().addProduto(p1, 2)
            .addProduto(p2, 1)
            .setCliente(c)
            .setEnderecoEntrega(new Endereco(
      "MG", "Contagem", "Europa", "32.155-054", "Rua teste", "1987"
    )).getResultado();

   /* builder.addProduto(p1, 2);
    builder.addProduto(p2, 1);
    builder.setCliente(c);
    builder.setEnderecoEntrega(new Endereco(
      "MG", "Contagem", "Europa", "32.155-054", "Rua teste", "1987"
    ));

    Pedido p = builder.getResultado();*/
    System.out.println(p);
    try {
      GeradorArquivoXML xml = new GeradorArquivoXML();
      xml.gerar("teste.xml", p);

    } catch(Exception e) {
      e.printStackTrace();
    }


/*
    ItemPedido i1 = new ItemPedido();
    i1.setPreco(p1.getPreco());
    i1.setQuantidade(1);
    i1.setProduto(p1);

    Endereco enderecoEntrega1 = new Endereco("MG", "Rio Branco", "Dinossauro", "30000000", "Rua Inexistente", "0");

    Pedido p = new Pedido(100);
    p.setEnderecoEntrega(enderecoEntrega1);
    p.setCalculoFrete(new FreteMG());
    // p.setCalculoFrete(new FreteRJ());
    // p.setCalculoICMS(new ICMS_AC());//Sem Factory
    p.setCalculoICMS(ICMSFactory.getICMSByUf(enderecoEntrega1.getUf())); // Com Factory, pode ser melhorada utilizando o campo FRETE ao invés do Endereço.
    p.getItens().add(i1);

    System.out.println("Valor total do pedido =" + p.obterTotal());
*/
  }
  
}