import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        float resultado;

        boolean divisioHecha = false;

        while(!divisioHecha) {

            try {

                System.out.print("Introduce el primer numero: ");
                n1 = sc.nextInt();
                System.out.print("Introduce el segundo numero: ");
                n2 = sc.nextInt();
                resultado = n1 / n2;

                System.out.print("El resultado es: " + resultado);
                divisioHecha = true;

            } catch (ArithmeticException a) {
                System.out.println("Error en la division " + a.getMessage());
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        }
    }
}
