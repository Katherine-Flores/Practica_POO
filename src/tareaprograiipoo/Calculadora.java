
package tareaprograiipoo;

import java.util.Scanner;


public class Calculadora {    
    //Atributos de Clase, pueden ser Publicos, Privados y Protegidos (en herencia)
    public String tipoCalculadora;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;
    
    //Constructor de la calse
    public Calculadora(String propietario){
        this.tipoCalculadora="Calculadora Basica";
        this.dimensionPantalla=10;
        this.numeroDeSerie="12345abc";
        this.color="Azul";
        this.nombrePropietario=propietario;
    }
    
    //Constructor vacio
    public Calculadora(){
    }
    
    //Are de declaración de metodos
    //en clase hemos dicho "funciones" anteriormente, pero en POO son metodos.
    public double sumar(double primerNumero, double segundoNumero){
        return primerNumero + segundoNumero;
    }
    
    public double restar(double primerNumero, double segundoNumero){
        return primerNumero - segundoNumero;
    }
    
    public double multiplicar(double primerNumero, double segundoNumero){
        return primerNumero * segundoNumero;
    }
    
    public double dividir(double primerNumero, double segundoNumero){
        return primerNumero / segundoNumero;
    }
    
    public double raizCuadrada(double numero){
        return Math.sqrt(numero);
    }
    
    public void esPrimo(){ //Cambie el metodo para que el usuario pueda ingresar el numero que desea verificar si es primo.
        Scanner sn = new Scanner(System.in);
        boolean primo = false;
        int contador = 0;
        int numeroBuscado = 0;
        System.out.println("Ingrese un numero entero");
        numeroBuscado = sn.nextInt();
        
        for(int i = numeroBuscado; i > 0; i--){
            if(numeroBuscado % i == 0 ){
                contador++;
            }
        }
        //Agregue otra condicion al if para que si el numero ingresado es 1 también lo considere como primo.
        if(contador == 2 || numeroBuscado == 1){ 
            primo = true;
            System.out.println(primo);
            System.out.println("El numero ingresado es primo");
        }else{
            primo = false;
            System.out.println(primo);
            System.out.println("El numero ingresado no es primo");
        }
    }   
}
