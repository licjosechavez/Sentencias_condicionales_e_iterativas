import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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




    }
}