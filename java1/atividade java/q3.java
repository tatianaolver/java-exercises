public class q3 {
    public static void main(String[] args) {
        int MAT[][];
        MAT = new int[5][5];
        double soma =0;

        for(int i = 0;i<MAT.length;i++){
            for(int c=0;c<MAT[i].length;c++){
                MAT[i][c]=i+c;
            }
        }
        for(int i = 0;i<5;i++){
            soma += MAT[i][i];
        }

        System.out.println("A soma dos valores foi: "+soma);
        System.out.println("A média dos valores é: "+soma/5);
    }
}
