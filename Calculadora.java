import java.util.Scanner; //Eduardo Agustin Felix Lopez 
public class Calculadora{ //Programa de una calculadora con sumas, restas, multiplicaciones, divisiones, exponentes y reaiz cuadrada
    public static void main (String[]args){

        //Declaracion de variables
        int opcion=0;
        double numero1;
        double numero2;
        Scanner leer=new Scanner(System.in);

        System.out.println();
        System.out.println("CALCULADORA: ");

        //Inicia el ciclo
        while(opcion!=7){
            //Imprime el menu de opciones
            System.out.println();
            System.out.print("Opciones: ");
            System.out.printf("\n 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir \n 5.Exponentes \n 6.Raiz cuadrada \n 7.Salir \n");
            System.out.println();

            System.out.print("Insertar opcion requerida: ");
            opcion=leer.nextInt();
            System.out.println();
            switch (opcion) {
                //Selecciona la opcion de suma
                case 1:
                    System.out.print("Insertar numero 1: ");
                    numero1=leer.nextDouble();
                    System.out.print("Insertar numero 2: ");
                    numero2=leer.nextDouble();
                    System.out.println();
    
                    System.out.printf("El resultado de %.0f + %.0f es igual a %.0f" , numero1,numero2,(numero1+numero2)); 
                    break;
                //Selecciona la opcion de resta
                case 2:
                    System.out.print("Insertar numero al que se le va a restar: ");
                    numero1=leer.nextDouble();
                    System.out.print("Insertar numero que restara: ");
                    numero2=leer.nextDouble();
                    System.out.println();
    
                    System.out.printf("El resultado de %.0f - %.0f es igual a %.0f" , numero1,numero2,(numero1-numero2)); 
                    break;
                //Selecciona la opcion de multiplicacion
                case 3:
                    System.out.print("Insertar numero 1: ");
                    numero1=leer.nextDouble();
                    System.out.print("Insertar numero 2: ");
                    numero2=leer.nextDouble();
                    System.out.println();
    
                    System.out.printf("El resultado de %.0f x %.0f es igual a %.0f" , numero1,numero2,(numero1*numero2)); 
                    break;
                //Selecciona la opcion de division
                case 4:
                    System.out.print("Insertar dividendo: ");
                    numero1=leer.nextDouble();
                    System.out.print("Insertar divisor: ");
                    numero2=leer.nextDouble();
                    System.out.println();
    
                    System.out.printf("El resultado de %.0f / %.0f es igual a %.0f" , numero1,numero2,(numero1/numero2)); 
                    break;
                //Selecciona la opcion de exponente
                case 5:
                    System.out.print("Insertar el exponente: ");
                    numero1=leer.nextDouble();
                    System.out.print("Insertar el coeficiente: ");
                    numero2=leer.nextDouble();
                    System.out.println();
    
                    System.out.printf("El resultado de %.0f^%.0f es igual a %.0f" , numero2,numero1,(Math.pow(numero2,numero1))); 
                    break;
                //Selecciona la opcion de raiz cuadrada
                case 6:
                    System.out.print("Insertar el numero: ");
                    numero1=leer.nextDouble();
                    System.out.println();
    
                    System.out.printf("La raiz cuadrada de $.0f es igual a %.0f" , numero1,(Math.sqrt(numero1))); 
                    break;
                default:
                    break;
            }//Fin del switch
        }//Fin del ciclo

        leer.close();
   }    
}