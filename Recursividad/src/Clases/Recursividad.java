package Clases;

public class Recursividad {

    public void ContarAtras(int numero) {

        if(numero <= 0) {
            System.out.println("Despegue!");
            return;
        }

        System.out.println(" "+numero);
        ContarAtras(numero - 1);
    }

}
