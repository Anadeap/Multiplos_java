import java.util.Scanner;

/*
Programa java que pide dos números por teclado
y saca por pantalla si son múltiplos o no
*/

public class Multiplos {
    public static void main(String args[]) {
        // clase Scanner para pedir los datos
        Scanner entrada=new Scanner(System.in);
        // se declaran 2 variables
        int x,y;
        // petición del primer número por teclado
        System.out.println("Introduce un número");
        x = entrada.nextInt();
        // petición del segundo número por teclado
        System.out.println("Introduce otro número");
        y = entrada.nextInt();
        // se comparan según el resto
        // y se saca el resultado por pantalla
        if(x%y==0){
            System.out.println(x + " es múltiplo de " + y);
        }
        else{
            System.out.println(x + " no es múltiplo de " + y);       
        }
    }
}// fin de la clase Multiplos

