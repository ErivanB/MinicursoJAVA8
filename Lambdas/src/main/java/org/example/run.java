package org.example;


// Usando uma classe anônima
Runnable tarefa = new Runnable() {
    @Override
    public void run() {
        System.out.println("Executando a tarefa.");
    }
};