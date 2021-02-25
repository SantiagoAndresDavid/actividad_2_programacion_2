import java.util.Scanner;
public class CuartoPunto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float  radio;

        System.out.println("valor del radio: ");
        radio = input.nextInt();
        
        float longitud = (float) (2 * Math.PI * radio);
        float  area = (float) (Math.PI *  Math.pow(radio,2));
        System.out.printf("La longitu: %.2f\n",longitud);
        System.out.printf("El area es: %.2f\n",area);
    }
}
