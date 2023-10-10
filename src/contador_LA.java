import java.util.Scanner;
public class contador_LA{


   /*  CON TIPO DE DATO STRING
   public static void main(String[] args) throws Exception {
        System.out.println("Introduce una letra, pulsa x para salir");
        Scanner scanner = new Scanner(System.in);

        String letra;
        letra = scanner.next();

        String letraant = "";

        int contador = 0;

        while(!letra.equals("x")){
            letraant = letra;
            System.out.println("Introduce una letra, pulsa x para salir");
            letra = scanner.next();
            
             if(letraant.equals("l") && letra.equals("a")){
                 contador++;
             }        
        }
        System.out.println("Se ha hecho la combinación de L + A " + contador + " veces");
        scanner.close();
    }*/
    
    // CON TIPO DE DATO CHAR
     public static void main(String[] args) throws Exception {
        System.out.println("Introduce una letra, pulsa x para salir");

        Scanner scanner = new Scanner(System.in);


        char letra = scanner.next().charAt(0);        

        char letraant = ' ';

        int contador = 0;

        while(letra != 'x'){
            letraant = letra;
            System.out.println("Introduce una letra, pulsa x para salir");
            letra = scanner.next().charAt(0);
            
             if(letraant == 'l' & letra == 'a'){
                 contador++;
             }        
        }
        System.out.println("Se ha hecho la combinación de L + A " + contador + " veces");
        scanner.close();
    }
}