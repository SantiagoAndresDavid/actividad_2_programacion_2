import java.util.Scanner;
public class TercerPunto {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        float num1,num2,num3;

        System.out.println("Numero 1: ");
        num1 = input.nextInt();
        System.out.println("Numero 2: ");
        num2 = input.nextInt();
        System.out.println("numero 3: ");
        num3 = input.nextInt();

        float suma = (num1+num2+num3);
        float prom = suma/3;
        float produc = num1*num2*num3;
        float cociente = ((num1/num2)/num3);
        float modulo = (num1%num2%num3);

        System.out.printf("la suma es: %.2f\n"+ suma);
        System.out.printf("promedio es %.2f\n"+ prom);
        System.out.printf("el producto es: %.2f\n"+produc);
        System.out.printf("el cociente es: %.2f\n"+cociente);
    }
}

