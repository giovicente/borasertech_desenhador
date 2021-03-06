package com.letscode.desenhador;

public class Cachorro extends Animal {

    private String nome;
    private int idade;

    // Aqui estou usando o polimorfismo de sobrecarga. Tomei essa decisão porquê era necessário imprimir o nome e idade do
    // pet... portanto precisei acrescentar esses parâmetros na assinatura do método
    public void desenha(String nome, int idade) {

        System.out.printf("Olá! Meu nome é %s, e tenho %d anos. Na idade de cachorro, eu tenho %d anos",
                nome, idade, (idade * 7));
        System.out.println();

        System.out.println("                             ;\\ \n" +
                "                            |' \\ \n" +
                "         _                  ; : ; \n" +
                "        / `-.              /: : | \n" +
                "       |  ,-.`-.          ,': : | \n" +
                "       \\  :  `. `.       ,'-. : | \n" +
                "        \\ ;    ;  `-.__,'    `-.| \n" +
                "         \\ ;   ;  :::  ,::'`:.  `. \n" +
                "          \\ `-. :  `    :.    `.  \\ \n" +
                "           \\   \\    ,   ;   ,:    (\\ \n" +
                "            \\   :., :.    ,'o)): ` `-. \n" +
                "           ,/,' ;' ,::\"'`.`---'   `.  `-._ \n" +
                "         ,/  :  ; '\"      `;'          ,--`. \n" +
                "        ;/   :; ;             ,:'     (   ,:) \n" +
                "          ,.,:.    ; ,:.,  ,-._ `.     \\\"\"'/ \n" +
                "          '::'     `:'`  ,'(  \\`._____.-'\"' \n" +
                "             ;,   ;  `.  `. `._`-.  \\\\ \n" +
                "             ;:.  ;:       `-._`-.\\  \\`. \n" +
                "              '`:. :        |' `. `\\  ) \\ \n" +
                "                 ` ;:       |    `--\\__,' \n" +
                "                   '`      ,' \n" +
                "                        ,-' ");



    }

    public Cachorro() {
    }

    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
