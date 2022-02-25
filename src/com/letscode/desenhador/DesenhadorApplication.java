package com.letscode.desenhador;

public class DesenhadorApplication {

    public static void main(String[] args) {


        Cachorro cachorro = new Cachorro("Bowie", 2);
        Gato gato = new Gato();
        Gato novoGato = new Gato();

        cachorro.desenha(cachorro.getNome(), cachorro.getIdade());
        gato.desenha();

        Gato.mia();

    }
}
