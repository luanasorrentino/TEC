import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);

        double a = leitor.nextFloat();
        double b = leitor.nextFloat();
        double c = leitor.nextFloat();

        double media = (a * 2 + b * 3 + c * 5)/10;
        System.out.printf("MEDIA = %.1f\n", media);
    }
}
