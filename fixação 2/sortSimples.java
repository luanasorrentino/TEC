import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    throws Exception{

        Scanner leitor = new Scanner(System.in);

        int a = leitor .nextInt();
        int b = leitor .nextInt();
        int c = leitor .nextInt();

        if(A>B && B>C && B>A && C>B && C>A && A>C){
            System.out.printf("%d %d %d\n", a, b , c);
        }else{
            if (A>B && B>C && B>A && C>B && C>A && A>C)
            System.out.printf("%d %d %d\n", a, b , c);
        }
    }
}