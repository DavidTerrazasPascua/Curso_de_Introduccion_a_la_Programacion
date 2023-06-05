// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your co

public class Main {

    public static void main(String[] args) {
          sumar(1,2,3);
          Coche miCoche =new Coche();
          miCoche.incrementarPuertas(1);
          System.out.println(miCoche.getCantPuertas());
        }

        public  static void sumar(int num1 , int num2 ,int num3){
            int suma= num1 + num2 +num3;
        }
    public static class Coche {
        private int cantPuertas=0;

        public Coche() {
        }

        public void incrementarPuertas(int cantPuertas){
            this.cantPuertas=cantPuertas;
        }
        public int getCantPuertas(){
            return this.cantPuertas;
        }

    }


}
