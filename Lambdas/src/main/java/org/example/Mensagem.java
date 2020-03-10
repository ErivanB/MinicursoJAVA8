package org.example;

@FunctionalInterface
interface Mensagem {
    void exibir(String texto);
}

// Usando classe anônima
Mensagem mensagemAntiga = new Mensagem() {
    @Override
    public void exibir(String texto) {
        System.out.println("Olá, " + texto);
    }
};

// Usando lambda
Mensagem mensagemLambda = (texto) -> System.out.println("Olá, " + texto);

mensagemAntiga.exibir("Mundo Antigo"); // Saída: Olá, Mundo Antigo
mensagemLambda.exibir("Mundo Lambda"); // Saída: Olá, Mundo Lambda