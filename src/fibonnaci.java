import java.util.Scanner;
public class fibonnaci {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Dime el número");

        int num = scanner.nextInt();
        int fibo1 = 0;
        int fibo2 = 1;
        int resultado = 0;
        System.out.print("La secuencia Fibonacci de " + num + " son: ");
        System.out.println("1: "+ fibo1);
		System.out.println("2: " + fibo2);

        for(int i = 3; i <= num ; i++){
            
            resultado = fibo1 + fibo2;
            System.out.println(i + ": " + resultado);
            fibo1 = fibo2;
            fibo2 = resultado;            
        }
        scanner.close();
    }
}
