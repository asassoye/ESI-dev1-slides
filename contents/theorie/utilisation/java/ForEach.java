public class ForEach {
    public static void main(String[] args) {
        String[] noms;
        ... // initialiser le tableau de noms
        for (String nom : noms) {
            System.out.println(nom);
        }

        for (int i = 0; i < noms.length; ++i) {
            System.out.println(noms[i]);
        }
    }
}