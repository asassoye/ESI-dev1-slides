public class SansInitialiseur {
    public static void main(String[] args) {
        int n, p, t[];
        ... // initialiser les valeurs de n et p
        t = new int[5];
        t[0] = 1;
        t[1] = n;
        t[2] = n + p;
        t[3] = 2 * p;
        t[4] = 12;
    }
}