import java.util.Scanner ;
public class SextoPunto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float peso,altura;
        System.out.println("ingrese el peso ");
        peso = input.nextFloat();
        System.out.println("ingrese la altura(En metros)");
        altura = input.nextFloat();
        float BIM = peso/altura*altura;
        System.out.printf("su indice de masa corporal es:%d\n",BIM);
    }
}