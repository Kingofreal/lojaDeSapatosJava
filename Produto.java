import java.util.Scanner;
public class Produto {
    
    static Scanner leia = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("BEM-VINDO");
        
        System.out.println("Informe a marca do calçado escolhido: ");
        String marca = leia.nextLine();
        /*System.out.println("Informe o tipo do calçado escolhido: ");
        String tipo = leia.nextLine();*/
        System.out.println("Informe o modelo do calçado escolhido: ");
        String modelo = leia.nextLine();
        System.out.println("Informe a cor do calçado escolhido: ");
        String cor = leia.nextLine();
        System.out.println("Informe o tamanho do calçado escolhido: ");
        String tamanho = leia.nextLine();
        System.out.print("Informe o preço do calçado escolhido: \nR$");
        double preco = leia.nextDouble();
        
        String precoFormatado = String.format("%.3f", preco);
        
        System.out.printf(" \n Você escolheu um calçado da " +marca+  " modelo " +modelo+ " da cor " +cor+ " de tamanho " +tamanho+ " no valor de: R$" + precoFormatado);
    
    }
    
}