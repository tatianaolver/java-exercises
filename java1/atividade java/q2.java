public class q2 {
    public static void main(String[] args) {
        int matA[][] = {{-3,1,0},{2,4,-2}};
        int matB[][] = {{-1,2},{3,5},{-2,6}};
        int matC[][];

        matC = new int[2][2];

        for(int i=0;i<3;i++){
            matC[0][0] += matA[0][i]*matB[i][0];
        }
        for(int i=0;i<3;i++){
            matC[0][1] += matA[0][i]*matB[i][1];
        }
        for(int i=0;i<3;i++){
            matC[1][0] += matA[1][i]*matB[i][0];
        }
        for(int i=0;i<3;i++){
            matC[1][1] += matA[1][i]*matB[i][1];
        }
        for(int i =0;i<matA.length;i++){
            for(int c=0;c<matA[i].length;c++){
                System.out.println(matA[i][c]);
            }
        }    
        System.out.println("==============");
        for(int i =0;i<matB.length;i++){
            for(int c=0;c<matB[i].length;c++){
                System.out.println(matB[i][c]);
            }
        }    
        System.out.println("===============");

        for(int i =0;i<matC.length;i++){
            for(int c=0;c<matC[i].length;c++){
                System.out.println(matC[i][c]);
            }
        }
    }
}
