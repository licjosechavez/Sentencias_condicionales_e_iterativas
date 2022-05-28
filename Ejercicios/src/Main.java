import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


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
        System.out.println("Ejercicio 1 \n");

        /* Captura de datos*/

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
