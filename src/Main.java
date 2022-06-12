public class Main {
    public static void main(String[] args) {

        //primera parte.
        int resultado= suma(10,20,30);
        System.out.println(resultado);
        //segunda parte.
        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();

        System.out.println(miCoche.puertas);

    }
    public static int suma(int valor1, int valor2,int valor3){
        return valor1+valor2+valor3;
    }

}
class Coche {
    public int puertas = 4;

    public void IncrementarPuertas(){
        this.puertas++;
    }
}