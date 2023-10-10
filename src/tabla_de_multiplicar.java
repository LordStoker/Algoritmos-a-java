import java.util.Scanner;
public class tabla_de_multiplicar {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de la tabla");
        int num = scanner.nextInt();
        int resultado = 0;

        for(int i=1; i<=10; i++){
            resultado = num * i;
            System.out.println(num + " x " + i + " es igual a " + resultado);
        }
        scanner.close();
    }

    
}
