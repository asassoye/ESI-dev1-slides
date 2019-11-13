public class SyllabusExercice100 {
   public static void inverserNombresNegatifs(int[] tableau){
      for (int i = 0; i < tableau.length; ++i) {
         if (tableau[i] < 0) {
            tableau[i] *= -1;
         }
      }
   }
}