package academy.mateodev.maratonajava.introducao;

import java.util.Scanner;

public class aula02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultado = i * n;
            System.out.println(n + " x " + i + " = " + resultado);
        }



    }
}
