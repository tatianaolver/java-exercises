import java.util.Scanner;

public class pesquisa {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double salario, maiorSalario = 0, somaSalario=0;
        int filhos, contador = 0, somaFilhos = 0, percentual900 = 0;
        String resposta = "";
        
        while(!resposta.equals("N")){
            System.out.print("Digite o salário: ");
            salario = scanner.nextDouble();
            somaSalario += salario;
            if(salario>maiorSalario){
                maiorSalario = salario;
            }
            if(salario <=900){
                percentual900 +=1;
            }
            System.out.print("Digite a quantidade de filhos: ");
            filhos = scanner.nextInt();
            somaFilhos += filhos;
            contador += 1;
            System.out.print("Quer cadastrar mais uma pessoa? [S/N]");
            resposta = scanner.next();
        }
        System.out.println("Ao todo foram cadastradas: "+contador);
        System.out.println("A média salárial foi de: "+ somaSalario/contador);
        System.out.println("A média de filhos foi de : "+ somaFilhos/contador);
        System.out.println("O maior salário cadastrado foi: R$"+maiorSalario);
        System.out.println("O percentual de pessoas com salário de até R$900 foi de:"+ (percentual900*100)/contador+"%");
        scanner.close();
    }
}