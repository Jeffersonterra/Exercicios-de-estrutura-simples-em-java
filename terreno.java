import java.util.Scanner;

class terreno {

    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o comprimento e a largura do terreno: ");
        System.out.println("Input the land's width and height: ");
      
        double x = leitor.nextDouble();
        double y = leitor.nextDouble();
        System.out.println("Digite o valor do terreno: ");
        System.out.println("Input the value per square meter ");
      
        double valor = leitor.nextDouble();
        double total = valor * x * y;
        System.out.printf("O preco do terreno eh: $ %1.2f", total);
        System.out.printf("The purchase total price is $ %1.2f", total);
        leitor.close();
    }
}
