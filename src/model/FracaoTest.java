package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FracaoTest {

    @Test
    void testConstruror(){
        Fracao fracao = new Fracao(4,0);
        System.out.println(fracao.valorReal());
    }

    @Test
    void resultado() {
        Fracao fracao = new Fracao(6,3);
        assertEquals(2.0,fracao.valorReal());
    }


    @Test
    void soma() {
        Fracao fracao1 = new Fracao(9,3);
        Fracao fracao = new Fracao(6,3);
        assertEquals(new Fracao(15,3),fracao.soma(fracao1));

    }

    @Test
    void subtracao() {
        Fracao fracao1 = new Fracao(9,3);
        Fracao fracao = new Fracao(6,3);
        assertEquals(new Fracao(3,3).valorReal(),fracao1.subtracao(fracao).valorReal());
    }

    @Test
    void multiplicacao() {
        Fracao fracao1 = new Fracao(9,3);
        Fracao fracao = new Fracao(6,3);
        assertEquals(new Fracao(54,9).valorReal(),fracao.multiplicacao(fracao1).valorReal());
    }

    @Test
    void divisao() {
        Fracao fracao1 = new Fracao(5,9);
        Fracao fracao = new Fracao(8,3);
        assertEquals(new Fracao(72,15).valorReal(),fracao.soma(fracao1).valorReal());
    }
}