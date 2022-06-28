package targetSistemas;

import java.util.Scanner;

public class SeguqenciaFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que pertence à sequência: ");
        int procurado = sc.nextInt();
        System.out.println("Qual a quantidade de números da sequência? ");
        int n = sc.nextInt();

        boolean confirmar = false;

        int proximo = 0,atual = 0,anterior = 1;
        while(proximo <= n){
            proximo=atual+anterior;
            System.out.print(proximo+",");
            anterior=atual;
            atual=proximo;

            if(procurado == atual){
                confirmar = true;
            }        }
        System.out.println();
        if(confirmar == true) {
            System.out.println("Número pertence à sequência!!!!");
        }else{
            System.out.println("Não pertence à sequência!!!!");
        }


    }
}
