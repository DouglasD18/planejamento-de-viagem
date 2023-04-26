package com.trybe.acc.java.planejamentodeviagem;

public class Viagem {
  private String embarque;
  private String origem;
  private String destino;
  private double distanciaKm;
  private Voo voo;

  /**
   * Método construtor da classe.
   * 
   */

  public Viagem(String embarque, String origem, String destino, int distanciaKm) {
    this.embarque = embarque;
    this.destino = destino;
    this.distanciaKm = distanciaKm;
    this.origem = origem;
    this.voo = new Voo();
  }

  /**
   * Método para retorno do horário de Desembarque no Destino.
   * 
   */
  public String retonarDesembarqueHorarioLocalDestino() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    return tempoViagem.retonarDesembarqueHorarioLocalDestino();
  }

  // aqui consideramos que um aviao percorre em media 700 km a cada hora
  public int retornarDuracaoVoo() {
    return this.voo.retornarTempoVoo(distanciaKm);
  }

  /**
   * Método para retorno da informaçao da viagem.
   * 
   */
  public String retornarInformacaoViagem() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());

    String desembarque = tempoViagem.retonarDesembarqueHorarioLocalDestino();

    return this.voo.retornarInformacaoVoo(embarque, origem, desembarque, destino);
  }
}
