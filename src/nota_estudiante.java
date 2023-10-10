import java.util.Scanner;

public class nota_estudiante {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int nota;        
        System.out.println("Introduce el un número");
        nota = scanner.nextInt();
        
        if (nota >= 5){
            System.out.println("Estás aprobado");
        }
        else{
            System.out.println("Suspendido");
        }
        scanner.close();
     
    }
}
