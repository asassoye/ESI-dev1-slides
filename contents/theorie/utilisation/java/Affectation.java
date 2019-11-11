import java.util.Arrays;

public class Affectation {
   public static void main(String[] args) {
      int nombre1 = 1;
      int nombre2 = nombre1;
      nombre2++;
      System.out.printf("nombre1: %d, nombre2: %d\n", nombre1, nombre2);

      int[] nombres1 = {1, 2, 3};
      int[] nombres2 = nombres1;
      nombres2[0] = 0;
      System.out.println("nombres1: " + Arrays.toString(nombres1));
      System.out.println("nombres2: " + Arrays.toString(nombres2));
   }
}