
import java.util.Scanner;
public class comparar_numeros {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num1;        
        int num2;

        System.out.println("Introduce el primer número");
        num1 = scanner.nextInt();

        System.out.println("Introduce el segundo número");
        num2 = scanner.nextInt();

        
        if(num1 > num2){
            System.out.println("El " + num1 + " es mayor que " + num2 + ".");
        }
        else if(num2>num1){
            System.out.println("El " + num2 + " es mayor que " + num1 + ".");
        }
        else{
            System.out.println("Los números son iguales");
        }
        scanner.close();

    }
}
