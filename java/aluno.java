import java.util.Scanner;

public class aluno {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, mediaP, mediaA;
        String resposta;

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();
        System.out.println("Deseja ver a média Aritimética ou Ponderada? [A/P]");
        resposta = scanner.next();
        if(resposta.equals("A")){
            mediaA = (nota1+nota2+nota3)/3;
            System.out.println("A média artimética do aluno foi: "+mediaA);
            System.out.println("O conceito obtido pelo aluno foi: "+conceitoaluno(mediaA));
        }
        if(resposta.equals("P")){
            mediaP = ((nota1*2)+(nota2*4)+(nota3*6))/12;
            System.out.println("A média ponderada do aluno foi: "+mediaP);
            System.out.println("O conceito obtido pelo aluno foi: "+conceitoaluno(mediaP));

        }
        scanner.close();
    }
    public static String conceitoaluno(double m){
        String conceito = "";
        if(m<= 4.9){
            conceito = "D";
            return conceito;
        }
        if(m==5 || m<=6.9){
            conceito = "C";
            return conceito;
        }
        if(m==7 || m<=8.9){
            conceito = "B";
            return conceito;
        }else{
            conceito = "A";
            return conceito;
        }
    }
}
