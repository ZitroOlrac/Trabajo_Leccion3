public class Main {
    public static void main(String[] args) {
        System.out.println("Trabajo Secion 3");
        System.out.println("Primera Parte");
        System.out.println("---------------------------");
        suma(10,2,7);
        System.out.println("Segunda Parte");
        System.out.println("---------------------------");
        Coche miCoche = new Coche();
        miCoche.SumarPuerta();
        System.out.println(miCoche.numPuertas);
    }
    public static void suma(int a,int b, int c){
        int rpta = a + b + c;
        System.out.println(rpta);
    }
}
class  Coche{
    int numPuertas=4;
    public void SumarPuerta(){
        this.numPuertas ++;
    }
}