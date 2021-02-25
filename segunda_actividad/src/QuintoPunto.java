import java.util.Scanner ;
public class QuintoPunto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un caracter");
        char caracter = input.next().charAt(0);
        System.out.printf("el valor entero es %d\n",(int)caracter);
    }
}
