import Clases.*;

public class Main {
    public static void main(String[] args) {

EcuacionSumatoria.ecuacionSumatoria();

System.out.println("RECURSIVIDAD");
Recursividad r = new Recursividad();
r.ContarAtras(10);

CicloFor cf = new  CicloFor(0,100,3);
cf.ForHechizo();

CicloWhile cf = new CicloWhile(0,100,3);
cf.WhileHechizo();


    }
}
