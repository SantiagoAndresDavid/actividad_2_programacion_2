import java.util.Scanner;

public class OnceaboPunto {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\t\tPunto once");
        int num = askNumber();

        showUnits(num);
    }

    private static int askNumber() {
        int num;
        while (true){
            System.out.print("ingrese un numero ente 0 y 1000: ");
            num = input.nextInt();

            if (num >= 1000 || num < 0){
                System.out.println("Fuero de rango, ingrese otro numero");
                continue;
            }
            break;
        }
        return num;
    }
    private static void showUnits(int num) {
        System.out.printf("unidad: %d\n",num % 10);
        System.out.printf("decena: %d\n",(num / 10) % 10);
        System.out.printf("centena: %d\n",(num / 100) % 10);
    }
}

