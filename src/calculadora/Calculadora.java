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
        boolean ciclo = true;
        do{
            do{
                System.out.println("Calculadora: (Seleccione una opcion)");
                System.out.println("1) Sumar 2 números");
                System.out.println("2) Restar 2 números");
                System.out.println("3) Multiplicar 2 números");
                System.out.println("4) Dividir 2 números");
                System.out.println("5) Mayor de 2 números");
                System.out.println("6) Porcentaje de un número");
                System.out.println("7) Salir");         
                try {
                    System.out.print("Opción ingresada: ");   
                    option = rengar.nextInt();
                    //Una vez asegurados de que solo se aceptan valores numericos
                    //comprobamos que estén en el rango aceptado
                    while(option<1 || option>7){
                        System.out.println("ERROR: Ingrese valores entre 1 y 6");
                        System.out.print("Opción ingresada: ");   
                        option = rengar.nextInt();
                    }
                    // Si no se presenta error salimos del ciclo
                    ciclo = false;
                }catch(InputMismatchException e){
                    System.err.printf("\n ERROR: %s\n", e);
                    rengar.nextLine();
                    System.out.println("Sólo se aceptan valores numéricos");
                }
            }while(ciclo);
            ciclo = true;
            do{
                try{
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
                            System.out.println("6. PORCENTAJE DE UN NUMERO");
                            System.out.print("Ingrese número: ");
                            num1 = rengar.nextDouble();
                            System.out.print("Ingrese porcentaje a obtener (ej: 0,4): ");
                            num2 = rengar.nextDouble();
                            while(num2<0 || num2>1){
                                System.out.println("ERROR: Sólo valores porcentuales entre 0 y 1");
                                num2 = rengar.nextDouble();
                            } 
                            System.out.println((num2*100)+"% de "+num1+" = "+(num1*num2));
                        case 7: 
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
                                option = 7;
                            }else{
                                option = 0;
                            }
                            break;
                    }
                    ciclo = false;
                }catch(InputMismatchException e){
                    System.err.printf("\n ERROR: %s\n", e);
                    rengar.nextLine();
                    System.out.println("Sólo se aceptan valores numéricos");   
                }
            }while(ciclo);
        }while(option<7);
    }
    
}
