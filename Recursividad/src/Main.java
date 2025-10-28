import Clases.*;

public class Main {
    public static void main(String[] args) {
        
System.out.println("========== ECUACION SUMATORIA ==========");
EcuacionSumatoria.ecuacionSumatoria();

System.out.println("========== RECURSIVIDAD ==========");
Recursividad r = new Recursividad();
r.ContarAtras(10);

System.out.println("========== CICLO FOR ==========");
CicloFor cf = new  CicloFor(0,100,3);
cf.ForHechizo();

System.out.println("========== CICLO WHILE ==========");        
CicloWhile cw = new CicloWhile(0,100,3);
cw.WhileHechizo();

    }
}
