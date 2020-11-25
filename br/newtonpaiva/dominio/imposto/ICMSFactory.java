package br.newtonpaiva.dominio.imposto;

public class ICMSFactory {

  public static ICMS getICMSByUf(String uf) {
    if("AC".equalsIgnoreCase(uf)) {
      return new ICMS_AC();
    }

    if("CE".equalsIgnoreCase(uf)) {
      return new ICMS_CE();
    }

    if("MG".equalsIgnoreCase(uf)) {
      return new ICMS_MG();
    }

    return null;
  }

}