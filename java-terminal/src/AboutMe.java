import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //usando o try e catch para tratamento de erros/excecoes.
        try{
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura");
        double altura = scanner.nextDouble();

        System.out.println("Olá, meu chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos" );
        System.out.println("Minha altura é " + altura + " cm");
        }
        catch (InputMismatchException e){
            System.err.println("Verifique os campos de altura (Ex: 1.70) e/ou idade (somente numeros)");
        }
    }
}
