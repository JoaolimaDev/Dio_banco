import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao cadastro DIO bank!");

        System.out.println("Vamos iniciar pelo o seu nome completo, por favor : ");

        String nome = sc.next();

        System.out.println("Por favor, digite o número da Agência !");

        String agencia = sc.next();

        System.out.println("Por favor, digite o numero da conta !");

        int numero = sc.nextInt();

        System.out.println("Por favor, digite o saldo !");

        double saldo = sc.nextDouble();

        System.out.println("olá" + nome + "obrigado por criar uma conta em nosso banco, sua agência é\n" 
        + agencia + ", conta" + numero + "e seu saldo" + saldo + ", já está disponivél pro saque");
        sc.close();

    }
}
