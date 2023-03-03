import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String [] vetor2 = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int [] vetor3;
        int maiorTemp, menorTemp, maiorVetor=0, menorVetor=0;

        vetor3 = new int [12];
        System.out.println("                    ");
        System.out.println("Média de temperaturas");

        for(int i = 0; i<vetor1.length; i++){
            System.out.println("Digite a média de temperatura o mês "+vetor1[i]+"-"+vetor2[i]+": ");
            vetor3[i] = scanner.nextInt();
        }
        maiorTemp = vetor3[0];
        menorTemp = vetor3[0];
        for(int i = 0; i<vetor1.length; i++){
            if(vetor3[i]>maiorTemp){
                maiorTemp = vetor3[i];
                maiorVetor = i;
            }
            if(vetor3[i]<menorTemp){
                menorTemp = vetor3[i];
                menorVetor = i;
            }
        }
        System.out.println("A maior média de temperatura foi de: "+maiorTemp+" graus e ocorreu durante o mês: "+vetor1[maiorVetor]+"-"+vetor2[maiorVetor]);
        System.out.println("A menor média de temperatura foi de: "+menorTemp+" graus e ocorreu durante mês: "+vetor1[menorVetor]+"-"+vetor2[menorVetor]);
        scanner.close();
    }
}
