import java.util.Scanner;

public class potencia_de_base {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nº base");
        int base = scanner.nextInt();

        System.out.println("Introduce el nº exponente");
        int potencia = scanner.nextInt();

        int resultado = 1;

        for(int i = 1; i<=potencia; i++){
            System.out.println(base + " x " + resultado);
            resultado = base * resultado;
            
        }
        System.out.println(base + " elevado a " + potencia + " es igual a " + resultado);

        scanner.close();
    }

}
