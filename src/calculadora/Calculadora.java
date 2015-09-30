package calculadora;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Camilo
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner rengar = new Scanner(System.in);
        int option = 0;
        int optionB;
        double num1,num2;
        do{
            System.out.println("Calculadora: (Seleccione una opcion)");
            System.out.println("1) Sumar 2 números");
            System.out.println("2) Restar 2 números");
            System.out.println("3) Multiplicar 2 números");
            System.out.println("4) Dividir 2 números");
            System.out.println("5) Mayor de 2 números");
            System.out.println("6) Salir");
            do{
                try {
                System.out.print("Opción ingresada: ");           
                option = rengar.nextInt();
                }catch(InputMismatchException e){
                    System.out.println("ERROR: No ingresó el número de la opción");
                    System.out.println("Quiere continuar?");
                    System.out.println("1) SI");
                    System.out.println("2) NO");
                    optionB = rengar.nextInt();
                    if(optionB == 2){
                        option = 6;
                    }
                }
            }while(option<1 || option>6);            
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
                    System.out.print("Ingrese numerador: ");
                    num1 = rengar.nextDouble();
                    System.out.print("Ingrese denominador: ");
                    num2 = rengar.nextDouble();
                    while(num2==0){
                        System.out.print("ERROR: Ingrese un divisor distinto de 0: ");         
                        num2 = rengar.nextDouble();
                    }
                    System.out.println("Resultado:");
                    System.out.println(num1+" / "+num2+" = "+(num1/num2));
                    break;
                case 5:
                    System.out.println("5. MAYOR DE 2 NÚMEROS");
                    System.out.print("Ingrese primer número: ");
                    num1 = rengar.nextDouble();
                    System.out.print("Ingrese segundo número: ");
                    num2 = rengar.nextDouble();
                    System.out.println("Resultado:");
                    if(num1>num2){
                        System.out.println("El mayor es: "+num1);
                    }else{
                        System.out.println("El mayor es: "+num2);
                    }
                    break;
                case 6: 
                    System.out.println("Salir ?");
                    System.out.println("1) SI");
                    System.out.println("2) NO");
                    System.out.print("Opción ingresada: ");
                    optionB = rengar.nextInt();
                    while(optionB<1 || optionB>2){
                        System.out.print("ERROR: Ingrese una opción válida: ");
                        optionB = rengar.nextInt();
                    }
                    if(optionB==1){
                        option = 6;
                    }else{
                        option = 0;
                    }
                    break;
            }
        }while(option<6);
    }
    
}
