package br;

import br.taferas.Tarefa;

public class Principal {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa();
        Tarefa tarefa2 = new Tarefa();
        Tarefa tarefa3 = new Tarefa();

        tarefa1.setDescricao("Estudar");
        tarefa2.setDescricao("Ler um livro");
        tarefa3.setDescricao("Jogo Online");

        tarefa1.setHorasEstudo(4);
        tarefa2.setHorasEstudo(1);
        tarefa3.setHorasEstudo(3);

        tarefa1.status();
        tarefa2.status();
        tarefa3.status();
    }
}
