import java.util.Scanner;

public class triangulo {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double x, y, z;
        System.out.print("Digite o primeiro lado do triângulo:");
        x = scanner.nextDouble();
        System.out.print("Digite o segundo lado do triângulo:");
        y = scanner.nextDouble();
        System.out.print("Digite o terceiro lado do triângulo:");
        z = scanner.nextDouble();
        if ((x > y-z) & (x < y+z) & (y > x-z) & (y < x+z) & (z > x-y) & (z < x+y)){
            System.out.println("Forma um triângulo!");
            System.out.println("O triângulo formado é do tipo: "+tipotriangulo(x, y, z));
        }else{
            System.out.println("Não forma um triângulo!");
        }
        scanner.close();
    }
    public static String tipotriangulo(double a, double b, double c){
        String tipo = "";
        if(a==b && b==c){
            tipo = "Equilátero";
            return tipo;
        }
        if(a==b || b==c || a==c){
            tipo = "Isóceles";
            return tipo;
        }else{
            tipo = "Escaleno";
            return tipo;
        }
    }
}