import java.util.Scanner;
public class PrimerPunto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;

        System.out.println("Numero 1: ");
        num1 = input.nextInt();
        System.out.println("Numero 2: ");
        num2 = input.nextInt();

        System.out.printf("”x = %d\\n\", num1");
        System.out.printf("El valor de %d + %d es %d\n", num1, num2, ( num1 + num2 ) );
        System.out.printf("x=%.2f", (float) num1 );
        System.out.printf("%d - %d\n", ( num1 + num2), ( num2 + num1 ) );

    }
}