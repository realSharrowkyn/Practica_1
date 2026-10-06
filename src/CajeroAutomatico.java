import java.util.Scanner;
public class CajeroAutomatico {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int Saldo, Retirar;
        final int LIMITE_RETIRO = 5000;
        final int COMISION_RETIRO = 500;
        System.out.println("--Hola, bienvenido a su cajero automatico--");
        System.out.println("Ingrese su saldo: ");
        Saldo =  scanner.nextInt();
        System.out.println("Ingrese la cantidad a retirar: ");
        Retirar = scanner.nextInt();

        if (LIMITE_RETIRO<Retirar){
            System.out.println("Solo es posible retirar una suma menor o igual a: $" + LIMITE_RETIRO);
        }
        else if (Retirar>Saldo) {
            System.out.println("Fondos insuficientes");
        }
        else if (Saldo - Retirar <= COMISION_RETIRO){
            System.out.println("Retiro autorizado por: $" +  Retirar);
            System.out.println("Efectivo entregado");
            System.out.println("Saldo restante: $" + (Saldo - Retirar));
            System.out.println("Advertencia. Su saldo es de: $" + (Saldo- Retirar) + ", evite comisiones");
        }
        else{
            System.out.println("Retiro autorizado por: $" +  Retirar);
            System.out.println("Efectivo entregado");
            System.out.println("Saldo restante: " + (Saldo - Retirar));
        }
    }
}
