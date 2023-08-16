import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) 
    throws Exception{

        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();

        if(B>C && D>A && C+D>A+B && C>=0 && D>=0 && A % 2 ==0){
            System.out.println("Valores aceitos\n" + a + b + c + d);
        }else{
            System.out.println("Valores nao aceitos\n" + a + b + c + d);
        }
    }
}