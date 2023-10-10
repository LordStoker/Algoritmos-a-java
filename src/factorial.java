import java.util.Scanner;

public class factorial {
      public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Dime de qué número quieres el factorial");
     int num = scanner.nextInt();
     int resultado = 1;

     for(int i = 1; i<= num; i++){
       
        resultado = resultado * i;
        
     }
     System.out.println(("El factorial de " + num + " es " + resultado));

     scanner.close();
    }
}
