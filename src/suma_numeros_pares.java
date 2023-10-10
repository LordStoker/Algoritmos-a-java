

public class suma_numeros_pares {
    public static void main(String[] args) throws Exception {      
        int suma = 0;
        for(int i=0; i<100; i+=2){
            suma = suma + i;
            System.out.println(suma + " + " + i + " = " + suma);
        }      
    }
}
