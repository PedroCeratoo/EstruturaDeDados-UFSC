package Recursividade;

public class Imprime10 {

    public static void imprime10(int n) {
        if (n == 1) {
            System.out.println(1);
        }
        else {
            System.out.println(n);
            imprime10(n-1);
        }
    }

    public static void main(String[] args) {
        imprime10(10);
    }
}
