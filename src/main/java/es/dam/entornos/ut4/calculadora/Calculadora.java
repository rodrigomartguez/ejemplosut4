package es.dam.entornos.ut4.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int opcion = -1;
        double a,b,res;
        Operacion op = null;
        Scanner sc = new Scanner(System.in);
        while(opcion != 7) {          
            System.out.println("Introduce la operación (1: suma, 2: resta, 3: muliplica, 4: divide");        
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1: //suma
                      System.out.println("Introduce el primer operando");
                      a = sc.nextDouble();
                      System.out.println("Introduce el segundo operando");
                      b = sc.nextDouble();
                      op = new Operacion(a,b);
                      res = op.getA() + op.getB();
                      System.out.println("El resultado de la suma es: " + res);
                      break;
                case 2: //resta
                      System.out.println("Introduce el primer operando");
                      a = sc.nextDouble();
                      System.out.println("Introduce el segundo operando");
                      b = sc.nextDouble();
                      op = new Operacion(a,b);
                      res = op.getA() - op.getB();
                      System.out.println("El resultado de la resta es: " + res);
                      break;
                case 3: //multiplicación
                      System.out.println("Introduce el primer operando");
                      a = sc.nextDouble();
                      System.out.println("Introduce el segundo operando");
                      b = sc.nextDouble();
                      op = new Operacion(a,b);
                      res = op.getA() * op.getB();
                      System.out.println("El resultado de la multiplicación es: " + res);
                      break;
                case 4: //división
                      System.out.println("Introduce el primer operando");
                      a = sc.nextDouble();
                      System.out.println("Introduce el segundo operando");
                      b = sc.nextDouble();
                      op = new Operacion(a,b);
                      res = op.getA() / op.getB();
                      System.out.println("El resultado de la división es: " + res);
                      break;
                case 5: //área de circunferencia
                      System.out.println("Introduce el valor para el radio");
                      a = sc.nextDouble();
                      res = 3.14 * a * a;
                      System.out.println("El área de la circunferencia es: " + res);    
                      break;
                case 6: //longitud de la circunferencia
                      System.out.println("Introduce el valor para el radio");
                      double r = sc.nextDouble();
                      res = 2 * 3.14 * r;
                      System.out.println("la longitud de la circunferencia es: " + res);    
                      break;
                case 7: //Salir
                    System.out.println("Salir");                    
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
    
    
}
