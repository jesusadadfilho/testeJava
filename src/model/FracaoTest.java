package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FracaoTest {

    @Test
    void testConstruror(){
    }

    @Test
    void resultado() {
        Fracao fracao = new Fracao(6,3);
        assertEquals(2.0,fracao.resultado());
    }


    @Test
    void soma() {
        Fracao fracao1 = new Fracao(9,3);
        Fracao fracao = new Fracao(6,3);
        assertEquals(new Fracao(15,3),fracao.soma(fracao1));

    }

    @Test
    void subtracao() {
    }

    @Test
    void multiplicacao() {
    }

    @Test
    void divisao() {
    }
}