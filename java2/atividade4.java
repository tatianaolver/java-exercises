import java.util.Scanner;
public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor1[];
        int vetor2[];
        int auxiliar =0;

        vetor1 = new int [10];
        vetor2 = new int [5];
        for(int i =0; i<vetor1.length; i++){
            System.out.print("Digite um valor para a posição Nº"+i+" do vetor: ");
            vetor1[i] = scanner.nextInt();
        }

        for(int i=0;i<vetor2.length;i++){

            for(int j=0;j<vetor2.length; j++){
                if(vetor1[i]<vetor1[j]){
                    auxiliar = vetor1[i];
                    vetor1[i] = vetor1[j];
                    vetor1[j] = auxiliar;
                }
            }
        }
        for(int i=0;i<vetor2.length;i++){
            System.out.println(vetor1[i]);
        }
        scanner.close();

    }
}
