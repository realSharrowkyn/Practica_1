import java.util.Scanner;
public class CajeroConComision {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int COMISION = 10;
        final int LIMITE_RETIRO = 5000;
        int retiro;
        int saldo;
        System.out.println("--Bienvenido a su cajero (Se aplica una comision de $10)--");
        System.out.println("Ingrese su saldo: ");
        saldo = scanner.nextInt();
        System.out.println("Introduzca la cantidad que desea retirar: ");
        retiro = scanner.nextInt();
        if (retiro > 0 && retiro <= LIMITE_RETIRO && (retiro + COMISION) <= saldo){
            System.out.println("Su retiro por: $" + retiro + " se ha efectuado exitosamente");
            System.out.println("Con una comision de: $" + COMISION);
            int RetiroTotal = retiro + COMISION;
            System.out.println("Su saldo restante es de: $" + (saldo - RetiroTotal));
        }
        else {
            System.out.println("--Operacion no valida--");
            System.out.println("Verifique que el monto sea mayor a $0, no rebase los $" + LIMITE_RETIRO + " y cubra el retiro más la comisión.");
        }
        }
    }

