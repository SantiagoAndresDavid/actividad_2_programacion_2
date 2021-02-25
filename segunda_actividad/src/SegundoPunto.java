import java.util.Scanner;

public class SegundoPunto {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1,num2;

        System.out.println("Numero 1: ");
        num1 = input.nextInt();
        System.out.println("Numero 2: ");
        num2 = input.nextInt();

        System.out.println("la suma de estos numeros es:"+ (num1 + num2) );
        System.out.println("la multiplicacion de estos numeros es: "+(num1+num2));
        System.out.println("la diferencia entre estos numeroes es: "+ (num1-num2) );
    }
}
