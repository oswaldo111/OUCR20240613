package org.example;

public class OperacionesMatematicasOURC {

    public static double raiz(double num){

        if(num < 0.0) throw new IllegalArgumentException("no se puede ingresar un numero negativo");

        return Math.sqrt(num);
    }

    public  void main(String[] args) {
        raiz(25);
    }
}
