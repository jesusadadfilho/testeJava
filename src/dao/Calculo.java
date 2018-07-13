package dao;

public class Calculo {
    public static float mdc(float a, float b){
        while(b != 0){
            float r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static float mmc(float a, float b){
        return a * (b / mdc(a, b));
    }
}
