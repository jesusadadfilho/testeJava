package app;

import model.Fracao;

public class Teste {
    public static void main(String[] args) {
        Fracao fracao = new Fracao(5,3);
        Fracao fracao1 = fracao.soma(new Fracao(6, 3));
        System.out.println(fracao1.soma(fracao));
    }
}
