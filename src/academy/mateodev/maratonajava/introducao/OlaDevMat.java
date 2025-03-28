package academy.mateodev.maratonajava.introducao;

import java.util.Scanner;

public class OlaDevMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] N = new int[25];
        int contPAR =0;
        int contIMPAR =0;
        for (int i =0; i <25; i++) {
            N[i] = sc.nextInt();
            if (N[i] % 2 ==0) {
                contPAR = contPAR + 1;
            }
            else {
                contIMPAR = contIMPAR + 1;
            }
        }
        System.out.println("Quantidade de números Pares: " + contPAR);
        System.out.println("Quantidade de números Impar: " + contIMPAR);

        sc.close();
    }
}
