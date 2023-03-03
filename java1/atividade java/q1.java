import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int MAT[][];
        int maiorValor, menorValor, maiorLinha =0, maiorColuna=0, menorLinha=0, menorColuna=0;
        MAT = new int [6][3];

        for(int i=0;i<MAT.length;i++){
            for(int c=0;c<MAT[i].length;c++){
                System.out.print("Digite um numero para a posição ["+i+"]["+c+"]: ");
                MAT[i][c] = scanner.nextInt();
            }
        }
        maiorValor = MAT[0][0];
        menorValor = MAT[0][0];
        for(int i=0;i<MAT.length;i++){
            for(int c=0;c<MAT[i].length;c++){
                if(MAT[i][c]>maiorValor){
                    maiorValor=MAT[i][c];
                    maiorLinha = i;
                    maiorColuna = c;
                }
                if(MAT[i][c]<menorValor){
                    menorValor=MAT[i][c];
                    menorLinha = i;
                    menorColuna =c;
                }
            }
        }
        System.out.println("O maior valor apresentado foi: "+maiorValor+" na posição ["+maiorLinha+"]["+maiorColuna+"]");
        System.out.println("O menor valor apresentado foi: "+menorValor+" na posição ["+menorLinha+"]["+menorColuna+"]");
        scanner.close();
        


    }
}