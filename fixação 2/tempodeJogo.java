import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);

        int horaI = leitor.nextInt();
        int horaF = leitor.nextInt();
        int minutoI = leitor.nextInt();
        int minutoF = leitor.nextInt();

        if(horaI > horaF){
            System.out.printf("O JOGO DUROU" + (24 - (horaI - horaF)) "HORA(S)\n");
        }else if(horaI < horaF){
            System.out.printf("O JOGO DUROU" + (horaF - horaI) "HORA(S)\n");
        }else{
            printf("O JOGO DUROU 24 HORA(S)\n");
        }
    }
}
