import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception{

        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();

        int prod = a * b;

        System.out.println("PROD = " + prod);
    }
}
