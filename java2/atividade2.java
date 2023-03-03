import java.util.Scanner;

public class atividade2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int [] vetor1;

        vetor1 = new int[8];

        for(int i = 0; i < vetor1.length; i++){
            System.out.print("Digite o valor para o vetor na posição Nº"+i+": ");
            vetor1[i] = scanner.nextInt();
        }
        System.out.println("                     ");
        System.out.println("Vetor com valores positivos: ");
        System.out.print("|");
        for(int i = 0; i<vetor1.length; i++){
            if(vetor1[i]>=0){
                System.out.print(vetor1[i]+"|");
        }
        }
        System.out.println("");
        System.out.println("                        ");
        System.out.println("Vetor com valores negativos: ");
        System.out.print("|");
        for(int i = 0; i<vetor1.length; i++){
            if(vetor1[i]<0){
                System.out.print(vetor1[i]+"|");
        }
        }
        scanner.close();
    }
}
