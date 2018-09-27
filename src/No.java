/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Erberto Sousa
 */
class No {
  int grau;
  int indice;
  No pai;

  public No(int grau, int id, No pai) {
    this.grau = grau;
    this.indice = id;
    this.pai = pai;
  }
}