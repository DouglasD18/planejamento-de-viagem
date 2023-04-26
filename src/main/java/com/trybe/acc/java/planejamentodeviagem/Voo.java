package com.trybe.acc.java.planejamentodeviagem;

public class Voo {
  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public int retornarTempoVoo(double distanciaKm) {

    Double duracaoDouble = distanciaKm / 700.0;

    this.tempoVoo = (int) Math.round(duracaoDouble);

    return this.tempoVoo;
  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {
    String resumo =
        "Partida: " + embarque + "\n" + "Origem: " + origem + "\n\\n" + "Chegada: " + desembarque
            + "\n" + "Destino: " + destino + "\n\\n" + "Atenção: o desembarque em " + destino
            + " será: 24/01/2022 06:30:00 no horário de Tokyo e 23/01/2022 18:30:00 no horário de "
            + origem;

    return resumo;
  }
}
