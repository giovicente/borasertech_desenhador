package com.letscode.desenhador;

public class Gato implements IDesenhador {

    @Override
    public void desenha() {
        System.out.println("                              / )\n" +
                "              (\\__/)         ( (\n" +
                "              )    (          ) )\n" +
                "            ={      }=       / /\n" +
                "              )     `-------/ /\n" +
                "             (               /\n" +
                "              \\              |\n" +
                "             ,'\\       ,    ,'\n" +
                "             `-'\\  ,---\\   | \\\n" +
                "                _) )    `. \\ /\n" +
                "               (__/       ) )   \n" +
                "                         (_/");
    }

    @Override
    public void desenha(String nome, int idade) {

    }

    public static String mia() {
        return "Miau";
    }

}


// public class A extends B, C - não dá pra fazer
// public class A implements B, C - é possível fazer
