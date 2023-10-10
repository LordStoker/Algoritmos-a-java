import java.util.Scanner;

public class numeros_primos {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el rango mínimo");
        int min = scanner.nextInt();
        System.out.println("Dime el rango máximo");
        int max = scanner.nextInt();

        System.out.println("Los números primos entre " + min + " y " + max + " son:");

        for(int j = min; )
        for(int i = min; i<= max; i++){
            if(i == 1){
                i++;
         
            
        }

        scanner.close();
    }
}
