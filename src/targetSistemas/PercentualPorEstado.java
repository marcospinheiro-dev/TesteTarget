package targetSistemas;

public class PercentualPorEstado {
    public static void main(String[] args) {
        double SP = 67836.43, RJ = 36678.66, MG = 29229.88, ES = 27165.48, Outros = 19849.53;

        double soma = (SP + RJ + MG + ES + Outros);

        System.out.printf("SP: %.2f", SP/soma*100);
        System.out.println("%");
        System.out.printf("RJ: %.2f", RJ/soma*100);
        System.out.println("%");
        System.out.printf("MG: %.2f", MG/soma*100);
        System.out.println("%");
        System.out.printf("ES: %.2f", ES/soma*100);
        System.out.println("%");
        System.out.printf("Outros: %.2f", Outros/soma*100);
        System.out.println("%");


    }
}
