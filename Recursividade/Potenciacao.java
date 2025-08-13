package Recursividade;

public class Potenciacao {

    public static int potenciacao(int base, int exp) {

        if (exp == 0) {
            return 1;
        }
        else {
            return potenciacao(base, exp-1) * base;
        }
    }

    public static void main(String[] args) {
        System.out.println(potenciacao(2, 3));
    }
}
