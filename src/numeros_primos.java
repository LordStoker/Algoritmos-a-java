import java.util.Scanner;

public class numeros_primos {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el rango mínimo");
        int min = scanner.nextInt();

        System.out.println("Dime el rango máximo");
        int max = scanner.nextInt();

        boolean esPrimo;

        System.out.println("Los números primos entre " + min + " y " + max + " son:");

        for (int i = min; i <= max; i++) {
            esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }                               
            }
             if (esPrimo == true) {
                    System.out.println(i);
                }
            scanner.close();       
         }
    }
}
