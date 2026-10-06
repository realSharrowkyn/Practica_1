import java.util.Scanner;

public class TiendaConDescuentos {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        final double DESCUENTO_FRECUENTE = 0.10;
        final double DESCUENTO_VIP = 0.20;
        final double DESCUENTO_ADICIONAL = 0.05;
        int opcion;

        System.out.println("-- Bienvenido --");

        do {
            System.out.println("Ingrese el tipo de cliente al que corresponde:");
            System.out.println("1): Cliente normal");
            System.out.println("2): Cliente frecuente");
            System.out.println("3): Cliente VIP");
            System.out.println("4): Salir del sistema");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                scanner.nextLine();
                System.out.println("Ingrese su nombre: ");
                String nombre = scanner.nextLine();

                System.out.println("Ingrese el monto de su compra: ");
                int monto = scanner.nextInt();

                switch (opcion){
                    case 1:
                        if (monto > 2000) {
                            double DescuentoNormal = monto * DESCUENTO_ADICIONAL;
                            double totalNormal = monto - DescuentoNormal;
                            System.out.println("Nombre: " + nombre);
                            System.out.println("Monto original: $" + monto);
                            System.out.println("Descuento: $" + DescuentoNormal);
                            System.out.println("Total: $" + totalNormal);
                        } else {
                            System.out.println("Nombre: " + nombre);
                            System.out.println("Monto original: $" + monto);
                            System.out.println("Descuento: no aplica");
                            System.out.println("Total: $" + monto);
                        }
                        break;

                    case 2:
                        if (monto > 2000){
                            double DescuentoFrecuente = monto * (DESCUENTO_ADICIONAL + DESCUENTO_FRECUENTE);
                            double totalFrecuente = monto - DescuentoFrecuente;
                            System.out.println("Nombre: " + nombre);
                            System.out.println("Monto original: $" + monto);
                            System.out.println("Descuento: $" + DescuentoFrecuente);
                            System.out.println("Total: $" + totalFrecuente);
                        } else {
                            double DescuentoNormalFrecuente = monto * DESCUENTO_FRECUENTE;
                            double totalNormalFrecuente = monto - DescuentoNormalFrecuente;
                            System.out.println("Nombre: " + nombre);
                            System.out.println("Monto original: $" + monto);
                            System.out.println("Descuento: $" + DescuentoNormalFrecuente);
                            System.out.println("Total: $" + totalNormalFrecuente);
                        }
                        break;

                    case 3:
                        if (monto > 2000){
                            double DescuentoVIP = monto * (DESCUENTO_ADICIONAL + DESCUENTO_VIP);
                            double totalVIP = monto - DescuentoVIP;
                            System.out.println("Nombre: " + nombre);
                            System.out.println("Monto original: $" + monto);
                            System.out.println("Descuento: $" + DescuentoVIP);
                            System.out.println("Total: $" + totalVIP);
                        } else {
                            double DescuentoNormalVIP = monto * DESCUENTO_VIP;
                            double totalNormalVIP = monto - DescuentoNormalVIP;
                            System.out.println("Nombre: " + nombre);
                            System.out.println("Monto original: $" + monto);
                            System.out.println("Descuento: $" + DescuentoNormalVIP);
                            System.out.println("Total: $" + totalNormalVIP);
                        }
                        break;
                }
            }
            else if (opcion == 4) {
                System.out.println("Gracias por su visita. ¡Hasta pronto!");
            }
            else {
                System.out.println("Opcion no valida, por favor seleccione una opcion de la 1 a la 4");
            }

        } while (opcion != 4);
    }
}