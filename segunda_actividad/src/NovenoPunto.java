import java.util.Scanner;

public class NovenoPunto {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[]args){
        System.out.println("\n\t\tPunto nueve");
        System.out.print("Numero de dias del viaje: ");
        int recorrido = input.nextInt();

        System.out.print("¿ Cuantos kilometros conducio al dia ?:");
        float kmRecorridos  = input.nextFloat();

        System.out.print("¿ ingrese el consumo gasolina en litros ?");
        float  precioDelGAS = input.nextFloat();

        System.out.print("¿ Ingrese el promedio del kilometro por litro de gasolina ?:");
        float kmPorLitro = input.nextFloat();

        System.out.print("¿ ingrese el  pago por estacionamiento diario ?:");
        float PrecioPark  = input.nextFloat();

        System.out.print("¿ ingrese el pago de los peajes ?:");
        float PrecioTotal = input.nextFloat();

        float totalgas = (kmRecorridos/kmPorLitro)* precioDelGAS;
        float precioDeRut = PrecioPark * PrecioTotal;
        float viajeTotal = (totalgas* precioDeRut) * recorrido;

        System.out.printf("el total gastado en el viaje es de : %f\n",viajeTotal);
    }
}
