import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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