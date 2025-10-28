package Clases;

public class CicloFor {

    int rangoI;
    int rangoF;
    int incremento;

 public CicloFor(int in, int fin,int inc){
     rangoI=in;
     rangoF=fin;
     incremento=inc;
 }

 public void ForHechizo(){

     if(rangoF<=rangoI){

         System.out.println("Ciclo Finalizado");
         return;
     }

     System.out.println(rangoI);

     rangoI=rangoI+incremento;
     ForHechizo();

    }
}
