package br.taferas;

public class Tarefa {
  String descricao;
  int horas;

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setHorasEstudo(int horas) {
    this.horas = horas;
  }

  public void executar() {
    System.out.println("Executando tarefa: " + descricao);
  }

  public void finalizar() {
    System.out.println("Finalizando tarefa: " + descricao);
  }

  public void cancelar() {
    System.out.println("Cancelando tarefa: " + descricao);
  }

  public int tamanhoDescricao(){
    return this.horas;
  }

  public void status() {
    System.out.println(this.getDescricao());
    this.executar();
    System.out.println("Depois de " + this.tamanhoDescricao() + " horas");
    this.finalizar();
  }
}
