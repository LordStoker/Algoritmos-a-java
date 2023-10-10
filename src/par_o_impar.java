import java.util.Scanner;

public class par_o_impar {

    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in);
        int num1;  

        System.out.println("Introduce un número");
        num1 = scanner.nextInt();
        
        if(num1 == 0){
            System.out.println("El número es 0");
        }
        else if(num1 % 2 == 0){
            System.out.println("El " + num1 + " es par");
        }
        else {
             System.out.println("El " + num1 + " es impar");
        }
        scanner.close();
    }    
}
