import java.util.Scanner;
public class Funcionario {
				
				static Scanner leia = new Scanner(System.in);
				
				public static void main(String[] args) {
								
								System.out.print("Informe o seu nome: ");
								String nome = leia.nextLine();
								System.out.print("Informe seu cpf: ");
								String cpf = leia.nextLine();
								System.out.print("Informe a sua data de nascimento: ");
								String data_nasc = leia.nextLine();
								System.out.print("Informe o seu endereço: ");
								String endereco = leia.nextLine();
								System.out.print("Informe a sua matricula: ");
								int matricula = leia.nextInt();
								
								System.out.print("CADASTRADO COM SUCESSO");
				}
				
}