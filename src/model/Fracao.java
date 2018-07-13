package model;
import dao.Calculo;

public class Fracao {
    private float numerador;
    private float denominador;

    public Fracao(float numerador, float denominador) {
        this.numerador = numerador;
        if (denominador == 0){
            throw new RuntimeException();
        }
        this.denominador = denominador;
    }

    public float getNumerador() {
        return numerador;
    }

    public void setNumerador(float numerador) {
        this.numerador = numerador;
    }

    public float getDenominador() {
        return denominador;
    }

    public void setDenominador(float denominador) {
        this.denominador = denominador;
    }

    public double valorReal(){
        return this.numerador / this.denominador;
    }

    public Fracao soma(Fracao fracao){
        if (fracao == null){
            throw new RuntimeException();
        }
        Fracao fracaoResult;
        float resultD = Calculo.mmc(this.denominador, fracao.denominador);
        float resultA = (resultD / this.denominador) * this.numerador;
        float resultB = (resultD / fracao.denominador) * fracao.numerador;
        float resultN = resultA + resultB;
        fracaoResult = new Fracao(resultN, resultD);
        return  fracaoResult;
    }

    public Fracao subtracao(Fracao fracao){
        if (fracao == null){
            throw new RuntimeException();
        }
        Fracao fracaoResult;
        float resultD = Calculo.mmc(this.denominador, fracao.denominador);
        float resultA = (resultD / this.denominador) * this.numerador;
        float resultB = (resultD / fracao.denominador) * fracao.numerador;
        float resultN = resultA - resultB;
        fracaoResult = new Fracao(resultN, resultD);
        return  fracaoResult;

    }

    public Fracao multiplicacao(Fracao fracao){
        float resultadoD = this.denominador * fracao.denominador;
        float resultadoN = this.numerador * fracao.numerador;
        return new Fracao(resultadoN,resultadoD);
    }

    public Fracao divisao(Fracao fracao){
        float resultadoD = this.denominador * fracao.numerador;
        float resultadoN = fracao.denominador * this.numerador;
        return new Fracao(resultadoN, resultadoD);
    }
}
