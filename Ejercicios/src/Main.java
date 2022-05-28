import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        importeCompra();

    }

    private static void importeCompra() {
        //Variables

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);



        triangulos();


    }

    private static void triangulos() {
        /* Encabezado*/

        System.out.println("Sentecias condicionales \n");
        System.out.println("Ejercicio 6 \n");

        //Resolucion a
        /*

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *

        */

        //Resolucion b

        /*

         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */

        //Resolucion c

        /*

                   *
                 * *
               * * *
             * * * *
           * * * * *
         * * * * * *
       * * * * * * *

         */

        System.out.println("\nTriangulo a\n");

        for (int i = 0; i < 7; i++){
            String asterisco = "";

            for(int j = 0; j < i + 1; j++){
                asterisco += "*";
            }
            System.out.println(asterisco);

        }


        //Resolucion b
        System.out.println("\nTriangulo b\n");

        for (int i = 0; i < 7; i++){
            String asterisco = "";

            for(int j = 0; j < 7 - i; j++){
                asterisco += "*";
            }
            System.out.println(asterisco);

        }

        //Resolucion c
        System.out.println("\nTriangulo c\n");

        for (int i = 0; i < 7; i++){
            String asterisco = "";

            for(int j = 0; j < 6 - i; j++){
                asterisco += " ";
            }

            for (int j = 0; j < i + 1; j++) {
                asterisco += "*";
            }
            System.out.println(asterisco);

        }


        nros_1_al_10();


    }

    private static void nros_1_al_10() {
        /* Encabezado*/

        System.out.println("Sentecias condicionales \n");
        System.out.println("Ejercicio 5 \n");

        //Resolución

        for (int i = 1; i <= 10; i++) {
            System.out.println("Nº: " + i);
        }


        foo();



    }

    private static void foo() {
        /* Encabezado*/

        System.out.println("Sentecias condicionales\n");
        System.out.println("Ejercicio 4\n");

        for (int i = 0; i < 10; i++) {
            System.out.println("foo");
        }


        notasColegio();

    }

    private static void notasColegio() {
        //Variables

        Scanner scanner = new Scanner(System.in);

        /* Encabezado*/

        System.out.println("Sentecias condicionales \n");
        System.out.println("Ejercicio 3 \n");

        //Tomar datos

        System.out.println("Ingrese el nombre del cursante: ");
        String nombreCursante = scanner.nextLine();
        System.out.println("Ingrese la nota Nº 1 (entre 1 y 10): ");
        int nota1 = scanner.nextInt();
        System.out.println("Ingrese la nota Nº 2 (entre 1 y 10): ");
        int nota2 = scanner.nextInt();
        System.out.println("Ingrese la nota Nº 3 (entre 1 y 10): ");
        int nota3 = scanner.nextInt();

        // Cálculos

        float promedioNotas = (nota1 + nota2 + nota3) / 3;

        // Evaluación

        String estado = "";
        if(promedioNotas >= 1 && promedioNotas < 6){
            estado = "Desaprobado";
        }else if(promedioNotas >= 6 && promedioNotas < 9){
            estado = "Aprobado";
        }else if(promedioNotas >= 9 && promedioNotas <= 10){
            estado = "Promocionado";
        }

        //Salida

        System.out.println("===================================="
                + " Colegio Universitario: "
                + "====================================\n\n"
                + " Nombre del cursante: " + nombreCursante + "\n"
                + " Nota 1: " + nota1  + "\n"
                + " Nota 2: " + nota2  + "\n"
                + " Nota 3: " + nota3  + "\n"
                + " Promedio: " + promedioNotas  + "\n"
                + " Estado: " + estado  + "\n"
        );

        numeroMayor();

    }

    private static void numeroMayor() {

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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        /*Evaluar numero mayor*/

        if(numero1 == numero2){
            System.out.println("Los números son iguales");
        }else if(numero1 > numero2){
            System.out.println("El número mayor es: " + numero1);
        }else {
            System.out.println("El número mayor es: " + numero2);
        }


    }
}
