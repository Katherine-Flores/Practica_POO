
package tareaprograiipoo;

import java.util.Scanner;

public class TareaPrograIIPOO {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       Calculadora calculadora = new Calculadora("JP");
       CalculadoraEspecial especial = new CalculadoraEspecial();
       boolean salir = false;
       int opcion;
       
       do{
           System.out.println("");
           System.out.println("=======================");
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
           System.out.println("4. Dividir");
           System.out.println("5. Raiz Cuadrada");
           System.out.println("6. Verificar numero Primo");
           System.out.println("7. Raiz Cubica");
           System.out.println("8. Potencia");
           System.out.println("9. Calcular el seno de un angulo");
           System.out.println("10. Calcular el coseno de un angulo");
           System.out.println("11. Calcular la tangente de un angulo");
           System.out.println("12. Calcular la hipotenusa de un triangulo");
           System.out.println("0. Salir");
           System.out.println("Selecciona una opcion");
           System.out.println("=======================");
           opcion = sn.nextInt();
            switch(opcion){
                case 1:
                   System.out.println("El resultado de la suma es = " + calculadora.sumar(10, 5));
                   break;
                case 2:
                   System.out.println("El resultado de la resta es = " +calculadora.restar(10, 5));
                   break;
                case 3:
                   System.out.println("El resultado de la multiplicacion es = " +calculadora.multiplicar(10, 5));
                   break;
                case 4:
                    System.out.println("El resultado de la division es = " +calculadora.dividir(10, 5));
                    break;
                case 5:
                    System.out.println("El resultado de la raiz cuadrada es = " +calculadora.raizCuadrada(16));
                    break;
                case 6:
                    calculadora.esPrimo();
                    break;
                //------------------------------------ NUEVOS METODOS ----------------------------------------------
                case 7:
                    System.out.println("El resultado de la raiz cubica es = " + especial.raizCubica(8));
                    break;
                case 8:
                    System.out.println("El resultado de la potencia es = " + especial.potencia(5, 3));
                    break;
                case 9:
                    System.out.println("El seno del angulo es " + especial.senoDeUnAngulo(75));
                    break;
                case 10:
                    System.out.println("El coseno del angulo es " + especial.cosenoDeUnAngulo(75));
                    break;
                case 11:
                    System.out.println("La tangente del angulo es " + especial.tangenteDeUnAngulo(75));
                    break;
                case 12:
                    especial.hipotenusa();
                    break;
                //----------------------------------------------------------------------------------------------------
                case 0:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 0 y 12");
            }
       }
        while(!salir);         
    }
}
