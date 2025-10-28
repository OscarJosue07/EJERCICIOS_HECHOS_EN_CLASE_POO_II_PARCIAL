package Clases;

public class Persona {

    String nombre;

    int edad;

    String comida;

    public Persona(String n, int e, String c) {

        nombre = n;

        edad = e;

        comida = c;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        alimentacion();
    }
public void alimentacion(){
    System.out.println("Le Gusta Comer" +comida);
}
}
