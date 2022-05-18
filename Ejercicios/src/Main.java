import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        /* Encabezado*/

        System.out.println("Sentecias condicionales \n");
        System.out.println("Ejercicio 2 \n");

        //Tomar datos

        System.out.println("Ingrese el nombre del producto: ");
        String nombreProducto = scanner.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        float precioProducto = scanner.nextFloat();
        DecimalFormat df = new DecimalFormat("0.00");

        do{

            System.out.println("\nSeleccione un método de pago: -->\n"
                    + "\t\t\t1. Contado (15% de descuento)\n"
                    + "\t\t\t2. Débito (mismo precio)\n"
                    + "\t\t\t3. Tarjeta (10% de recargo)\n"
                    + "\t\t\t0. Cancelar compra\n");

            int metodoPago = scanner.nextInt();

            switch(metodoPago){
                case 1:{

                    float contado = precioProducto - ((precioProducto * 15) / 100);
                    System.out.println("===================================="
                            + " Precio de contado: "
                            + "====================================\n\n"
                            + " Nombre del producto: " + nombreProducto + "\n"
                            + " Precio final: $" + contado
                    );
                    flag = false;
                    break;
                }

                case 2:{
                    System.out.println("===================================="
                            + " Precio con débito: "
                            + "====================================\n\n"
                            + " Nombre del producto: " + nombreProducto + "\n"
                            + " Precio final: $" + precioProducto
                    );
                    flag = false;
                    break;
                }

                case 3:{
                    float tarjeta = precioProducto + ((precioProducto * 10) / 100);
                    System.out.println("===================================="
                            + " Precio con tarjeta: "
                            + "====================================\n\n"
                            + " Nombre del producto: " + nombreProducto + "\n"
                            + " Precio final: $" + tarjeta
                    );
                    flag = false;
                    break;
                }

                case 0:{
                    //Salida del sistema
                    System.out.println("===================================="
                            +" La compra ha sido cancelada! "
                            +"====================================\n");
                    flag = false;
                    break;
                }

                default:{
                    System.out.println("La opción seleccionada es incorrecta.\n Ingrese un valor correcto.");
                    break;
                }
            }
        }while(flag!=false);

    }
}