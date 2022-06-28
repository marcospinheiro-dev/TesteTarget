package targetSistemas;

import java.util.Scanner;

public class CaracteresString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.next();
        String adartne = "";

        for (int i = entrada.length() -1; i >= 0; i--) {
            adartne = adartne + Character.toString(entrada.charAt(i));
        }
        System.out.println();
        System.out.println(adartne);
    }
}
