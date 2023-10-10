import java.util.Scanner;

public class Calculadora_simple {

    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in);
     System.out.println("¿Qué cálculo quieres hacer: 1: Sumar, 2: Restar, 3: Dividir, 4: Multiplicar");
     int calc = scanner.nextInt();  

     int resultado = 0;

    if(calc == 1){
        System.out.println("Dime el primer número");     
        int num1 = scanner.nextInt();

        System.out.println("Dime el segundo número");
        int num2 = scanner.nextInt();

        resultado = num1 + num2;
        System.out.println("El resultado de la suma es " + resultado);
     }
    else if(calc == 2){
        System.out.println("Dime el primer número");     
        int num1 = scanner.nextInt();

        System.out.println("Dime el segundo número");
        int num2 = scanner.nextInt();

        resultado = num1 - num2;
        System.out.println("El resultado de la resta entre " + num1 + " y " + num2 + " es " + resultado);
     }
    else if(calc == 3){
        System.out.println("Dime el primer número");     
        int num1 = scanner.nextInt();

        System.out.println("Dime el segundo número");
        int num2 = scanner.nextInt();

        resultado = num1 / num2;
        System.out.println("El resultado de la multiplicación es " + resultado);
     }
    else if(calc == 4){
        System.out.println("Dime el primer número");     
        int num1 = scanner.nextInt();

        System.out.println("Dime el segundo número");
        int num2 = scanner.nextInt();

        resultado = num1 * num2;
        System.out.println("El resultado de la división es " + resultado);
     } 
    else{
        System.out.println("La opción no es válida");
    }
     scanner.close();
    }
}