public class SyllabusExercice100 {
   public static int nbDeNegatifs(int[] tableau){
      int compteur = 0;
      for (int i = 0; i < tableau.length; ++i) {
         if (tableau[i] < 0) {
            compteur++;
         }
      }
   }
}