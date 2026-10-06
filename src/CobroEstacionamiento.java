import java.util.Scanner;

public class CobroEstacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MOTOCICLETA = 10;
        final int AUTOMOVIL = 20;
        final int CAMIONETA = 30;
        final double PRIMER_DESCUENTO = 0.10;
        final double SEGUNDO_DESCUENTO = 0.20;
        int opcion;

        System.out.println("--Bienvenido al estacionamiento--");
        do {
            System.out.println("Ingrese el numero de la opcion que corresponda:");
            System.out.println("1): Motocicleta");
            System.out.println("2): Automovil");
            System.out.println("3): Camioneta");
            System.out.println("4): Salir");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                System.out.println("Ingrese su tiempo de estancia en horas:");
                double tiempo = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        double SubtotalMoto = tiempo * MOTOCICLETA;
                        if (tiempo >= 10) {
                            double descuentoMoto2 = SubtotalMoto * SEGUNDO_DESCUENTO;
                            double TotalMoto2 = SubtotalMoto - descuentoMoto2;
                            System.out.println("Su estancia ha sido de: " + tiempo + " horas");
                            System.out.println("Subtotal: $" + SubtotalMoto);
                            System.out.println("Descuento de estancia: $" + descuentoMoto2);
                            System.out.println("Total: $" + TotalMoto2);
                        } else if (tiempo >= 5) {
                            double DescuentoMoto = SubtotalMoto * PRIMER_DESCUENTO;
                            double totalMoto = SubtotalMoto - DescuentoMoto;
                            System.out.println("Su estancia ha sido de: " + tiempo + " horas");
                            System.out.println("Subtotal: $" + SubtotalMoto);
                            System.out.println("Descuento de estancia: $" + DescuentoMoto);
                            System.out.println("Total: $" + totalMoto);
                        } else {
                            System.out.println("Su estancia ha sido de: " + tiempo + " horas");
                            System.out.println("Subtotal: $" + SubtotalMoto);
                            System.out.println("Descuento de estancia: No aplica");
                            System.out.println("Total: $" + SubtotalMoto);
                        }
                        break;

                    case 2:
                        double SubtotalAuto = tiempo * AUTOMOVIL;
                        if (tiempo >= 10) {
                            double DescuentoAuto2 = SubtotalAuto * SEGUNDO_DESCUENTO;
                            double totalAuto2 = SubtotalAuto - DescuentoAuto2;
                            System.out.println("Su estancia ha sido de: " + tiempo + " horas");
                            System.out.println("Subtotal: $" + SubtotalAuto);
                            System.out.println("Descuento de estancia: $" + DescuentoAuto2);
                            System.out.println("Total: $" + totalAuto2);
                        } else if (tiempo >= 5) {
                            double descuentoAuto = SubtotalAuto * PRIMER_DESCUENTO;
                            double totalAuto = SubtotalAuto - descuentoAuto;
                            System.out.println("Su estancia ha sido de: " + tiempo + " horas");
                            System.out.println("Subtotal: $" + SubtotalAuto);
                            System.out.println("Descuento de estancia: $" + descuentoAuto);
                            System.out.println("Total: $" + totalAuto);
                        } else {
                            System.out.println("Su estancia ha sido de: " + tiempo + " horas");
                            System.out.println("Subtotal: $" + SubtotalAuto);
                            System.out.println("Descuento de estancia: No aplica");
                            System.out.println("Total: $" + SubtotalAuto);
                        }
                        break;

                    case 3:
                        double SubtotalCamioneta = tiempo * CAMIONETA;
                        if (tiempo >= 10) {
                            double DescuentoCamioneta2 = SubtotalCamioneta * SEGUNDO_DESCUENTO;
                            double TotalCamioneta2 = SubtotalCamioneta - DescuentoCamioneta2;
                            System.out.println("Su estancia ha sido de: " + tiempo + " horas");
                            System.out.println("Subtotal: $" + SubtotalCamioneta);
                            System.out.println("Descuento de estancia: $" + DescuentoCamioneta2);
                            System.out.println("Total: $" + TotalCamioneta2);
                        } else if (tiempo >= 5) {
                            double DescuentoCamioneta = SubtotalCamioneta * PRIMER_DESCUENTO;
                            double TotalCamioneta = SubtotalCamioneta - DescuentoCamioneta;
                            System.out.println("Su estancia ha sido de: " + tiempo + " horas");
                            System.out.println("Subtotal: $" + SubtotalCamioneta);
                            System.out.println("Descuento de estancia: $" + DescuentoCamioneta);
                            System.out.println("Total: $" + TotalCamioneta);
                        } else {
                            System.out.println("Su estancia ha sido de: " + tiempo + " horas");
                            System.out.println("Subtotal: $" + SubtotalCamioneta);
                            System.out.println("Descuento de estancia: No aplica");
                            System.out.println("Total: $" + SubtotalCamioneta);
                        }
                        break;
                }
            }
            else if (opcion == 4) {
                System.out.println("¡Hasta pronto!");
            }
            else {
                System.out.println("Opcion no valida, por favor seleccione una opcion de la 1 a la 4");
            }
        } while (opcion != 4);
    }
}