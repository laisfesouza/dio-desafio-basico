import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pelo Scanner os valores digitados no terminal
        //Exibir a mensagem final ou da conta criada

        Scanner criaConta = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco de Dados!\n");
        System.out.println("Digite seu nome para começar: ");
        String nome = criaConta.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = criaConta.next();

        System.out.println("Digite o numero da sua conta: ");
        int numeroConta = criaConta.nextInt();

        System.out.println("Digite o numero da sua agencia: ");
        int numeroAgencia = criaConta.nextInt();

        System.out.println("Digite o saldo da sua conta: ");
        double saldoConta = criaConta.nextDouble();

        System.out.printf("Olá " + nome + " " + sobrenome + " seu cadastro em nosso banco de dados foi realizado!");
        System.out.printf("Sua agencia é " + numeroAgencia + " sua conta é " + numeroConta + " com saldo de R$" + saldoConta);
    }
}