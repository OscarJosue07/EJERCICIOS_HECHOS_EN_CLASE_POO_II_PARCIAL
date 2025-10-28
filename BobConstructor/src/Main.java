import Clases.*;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Oscar", 18," Manzanas");

        p.mostrarInfo();

     BobOperacionesAritmeticas BobMath = new BobOperacionesAritmeticas(10,5);
     BobMath.MostrarResultados();
    }
}
