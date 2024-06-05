
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        System.out.print("-------Olá bem-vindo(a) ao Banco DIO--------\n");
        System.out.print("--Para criar uma conta siga as instruções!--\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite sua numero da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o nome da agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ conta +" e seu saldo R$"+ saldo +" já está disponível para saque");
    }
}
