package com.unicesar;
import java.util.Scanner;
public class DecimoPunto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float peso;
        System.out.println("ingrese el peso de un objeto en kilogramos");
        peso = input.nextFloat();
        float gramos = (float) (peso/0.0010000);
        float libras = (float) (peso * 2.2046 );
        float toneladas = (float) (peso/1000.0);
        System.out.printf("de kilogramos a gramos: %.2f\n",gramos);
        System.out.printf("de kilogrmos a libras: %.2f\n",libras);
        System.out.printf("de kilogramos a toneladas: %.2f\n ",toneladas);

    }
}
