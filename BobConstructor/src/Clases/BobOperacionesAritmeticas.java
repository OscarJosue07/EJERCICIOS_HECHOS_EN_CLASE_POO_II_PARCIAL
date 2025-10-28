package Clases;

public class BobOperacionesAritmeticas {
    double num1;
    double num2;

    public BobOperacionesAritmeticas(double n1, double n2){

        num1 = n1;
        num2 = n2;

    }

    public double sumar(){
        return num1 + num2;
    }

    public double restar(){
        return num1 - num2;
    }

    public double multiplicar(){
        return num1 * num2;
    }

    public double dividir(){
    if(num2==0){
        System.out.println("No Se Puede Dividir Entre 0");
        return 0;
    }
    return num1 / num2;
    }

    public void MostrarResultados(){

        System.out.println("********* Operaciones Aritmeticas *******");
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Resultado De La Suma: " + sumar());
        System.out.println("Resultado De La Resta: " + restar());
        System.out.println("Resultado De La Multiplicacion: " + multiplicar());
        System.out.println("Resultado De La Division: " + dividir());

    }

}
