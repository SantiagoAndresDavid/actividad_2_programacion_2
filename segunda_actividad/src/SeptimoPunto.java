import java.util.Scanner;

public class SeptimoPunto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ganacia,gasto;
        System.out.println("ingrese ganancia obtenida");
        ganacia = input.nextInt();
        System.out.println("costo del produccion ");
        gasto = input.nextInt();
        float porcentaje = ((gasto/ganacia) * 100);
        System.out.printf("el procentaje de utilidad es: ",porcentaje);

    }
}
