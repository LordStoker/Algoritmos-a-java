import java.util.Scanner;

public class rangos_notas {

    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in);
     int nota;    

     System.out.println("Introduce el un número");
     nota = scanner.nextInt();
    
     if (nota >= 9){
         System.out.println("Sobresaliente");
     }
     else if (nota >= 7){
         System.out.println("Notable");
     }
       else if (nota == 6){
         System.out.println("Bien");
     }
       else if (nota == 5){
         System.out.println("Aprobado");
     }
       else if (nota >= 3){
         System.out.println("Insuficiente");
     }
     else{
        System.out.println("Muy deficiente");
     }
      scanner.close();
    }    
}
