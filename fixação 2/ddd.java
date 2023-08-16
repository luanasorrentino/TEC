import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) 
    throws Exception{

        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();

        switch(a){
            case 61: 
                System.out.println("Brasilia\n"); 
                break;
            case 71: 
                System.out.println("Salvador\n");
                break;
            case 11:
                System.out.println("Sao Paulo\n");
                break;
            case 21:
                System.out.println("Rio de Janeiro\n");
                break;
            case 32:
                System.out.println("Juiz de Fora\n");
                break;
            case 19:
                 System.out.println("Campinas\n");
                 break;
            case 27:
                System.out.println("Vitoria\n");
                break;
            case 31:
                System.out.println("Belo Horizonte\n");
                break;
            default:
                System.out.println("DDD nao cadastrado\n");
                break;
            }
        }
    }