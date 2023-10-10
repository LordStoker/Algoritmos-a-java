import java.util.Scanner;

public class conversor_temperatura {
    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in);
     int temp; 
     int conv;  
     int resultado = 0;     
     System.out.println("¿Quieres pasar a 1. ºF o a 2. Cº");
     conv = scanner.nextInt();
     
     if(conv == 1){
        System.out.println("Introduce los grados Fahrenheit:");
        temp = scanner.nextInt();       
        resultado = (temp - 32) * 5/9;
        System.out.println(temp + " en Celsius son " + resultado + " en Fahrenheit");
     } 
     else if(conv == 2){
        System.out.println("Introduce los grados Celsius:");
        temp = scanner.nextInt();        
        resultado = (temp * 9/5) + 32;
        System.out.println(temp + " en Fahrenheit son " + resultado + " en Celsius");
     }
     else{
        System.out.println("La opción no es válida");
     }  
     scanner.close(); 
    }    
}
