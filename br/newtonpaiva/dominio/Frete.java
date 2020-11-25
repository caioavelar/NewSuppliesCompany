package br.newtonpaiva.dominio;


public interface Frete {
  Double getFrete();
}

/*
public class Frete {
  public Double getFreteMG() {
    return 0.5;
  }

  public Double getFreteSP() {
    return 0.7;
  }

  public Double getFreteRJ() {
    return 0.9;
  }

  public Double getFrete(String uf) {
    if(uf.equals("MG"))
      return getFreteMG();
    else if(uf.equals("SP"))
      return getFreteSP();
    else if(uf.equals("RJ"))
      return getFreteRJ();
    else if(uf.equals("BA"))
      return 0.4;
    else
      return 0.0;
  }

}*/