package Clases;

import java.util.Scanner;

public class EcuacionSumatoria {
    public static void ecuacionSumatoria()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int num = sc.nextInt();

        ForRecursivo fr = new ForRecursivo(num, 10);

        fr.forRecursivo();
    }
}