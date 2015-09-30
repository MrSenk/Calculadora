package calculadora;
import java.util.Scanner;

/**
 *
 * @author Camilo
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner rengar = new Scanner(System.in);
        int option;
        double num1,num2;
        do{
            System.out.println("Calculadora: (Seleccione una opcion)");
            System.out.println("1) Sumar 2 números");
            System.out.println("2) Restar 2 números");
            System.out.println("3) Multiplicar 2 números");
            System.out.println("4) Dividir 2 números");
            System.out.println("5) Salir");
            System.out.print("Opción ingresada: ");
            option = rengar.nextInt();
            while(option<1 || option>5){
                System.out.print("ERROR: Ingrese una opción válida: ");
                option = rengar.nextInt();
            }
            switch(option){
                case 1: 
                    System.out.println("1. SUMA DE 2 NÚMEROS");
                    System.out.print("Ingrese primer número: ");
                    num1 = rengar.nextDouble();
                    System.out.print("Ingrese segundo número: ");
                    num2 = rengar.nextDouble();
                    System.out.println("Resultado:");
                    System.out.println(num1+" + "+num2+" = "+(num1+num2));
                    break;
                case 2:
                    System.out.println("2. RESTA DE 2 NÚMEROS");
                    System.out.print("Ingrese primer número: ");
                    num1 = rengar.nextDouble();
                    System.out.print("Ingrese segundo número: ");
                    num2 = rengar.nextDouble();
                    System.out.println("Resultado: ");
                    System.out.println(num1+" - "+num2+" = "+(num1-num2));
                    break;
                case 3:
                    System.out.println("3. MULTIPLICACIÓN DE 2 NÚMEROS");
                    System.out.print("Ingrese primer número: ");
                    num1 = rengar.nextDouble();
                    System.out.print("Ingrese segundo número: ");
                    num2 = rengar.nextDouble();
                    System.out.println("Resultado:");
                    System.out.println(num1+" * "+num2+" = "+(num1*num2));
                    break;
                case 4: 
                    System.out.println("4. DIVISIÓN DE 2 NÚMEROS");
                    System.out.print("Ingrese primer número: ");
                    num1 = rengar.nextDouble();
                    System.out.print("Ingrese segundo número: ");
                    num2 = rengar.nextDouble();
                    System.out.println("Resultado:");
                    System.out.println(num1+" / "+num2+" = "+(num1/num2));
                    break;
                case 5: 
                    System.out.println("Hasta luego.");
            }
        }while(option<5);
    }
    
}
