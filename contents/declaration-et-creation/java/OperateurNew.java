import java.util.Scanner;

public class OperateurNew {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Quelle est la taille voulue? ");
        int n = clavier.nextInt();
        int t[] = new int [n]; // Creer un tableau d'entiers de taille n

        System.out.printf("La taille du tableau est de %d\n", t.length);
    }
}