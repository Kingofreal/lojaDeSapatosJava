import java.util.Scanner;
public class Cliente {
    
    static Scanner leia = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Informe o seu CPF: ");
        String cpf = leia.nextLine();
        System.out.print("Informe o seu Nome: ");
        String nome = leia.nextLine();
        System.out.print("Informe o seu enderço: ");
        String endereco = leia.nextLine();
        System.out.print("Informe o seu numero de telefone: ");
        String telefone = leia.nextLine();
        System.out.print("\nCadastrado com sucesso!");
    }
    
}