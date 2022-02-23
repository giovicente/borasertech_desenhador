package com.letscode.desenhador;

public class DesenhadorApplication {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro("Bowie", 2);
        Gato gato = new Gato();

        animal.desenha();
        cachorro.desenha(cachorro.getNome(), cachorro.getIdade());
        gato.desenha();

    }
}
