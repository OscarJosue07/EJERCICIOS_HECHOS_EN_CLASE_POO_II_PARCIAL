package Clases;

public class CicloWhile {

    int rangoI;
    int rangoF;
    int incremento;

    public CicloWhile(int in, int fin, int inc){
        rangoI = in;
        rangoF = fin;
        incremento = inc;
    }

    public void WhileHechizo(){
        if (incremento == 0) {
            System.out.println("Incremento no puede ser 0");
            return;
        }

        if (incremento > 0) {
            while (rangoI < rangoF) {
                System.out.println(rangoI);
                rangoI += incremento;
            }
        } else { // incremento < 0
            while (rangoI > rangoF) {
                System.out.println(rangoI);
                rangoI += incremento;
            }
        }

        System.out.println("Ciclo Finalizado");
    }
}
