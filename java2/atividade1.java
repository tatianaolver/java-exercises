import java.util.Scanner;

public class atividade1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] vetor1;

        vetor1 = new int [9];

        for(int i = 0; i<vetor1.length; i++){
            System.out.print("Digite o "+i+"º valor do vetor: ");
            vetor1[i] = scanner.nextInt();
        }
        System.out.println("      ");
        for(int i = 0; i<vetor1.length; i++){
        if(vetor1[i]%2!=0){
            System.out.print("Valor do vetor "+vetor1[i]);
            System.out.print(" // Posição do vetor: "+i);
            }
        }
        scanner.close();
    }
}