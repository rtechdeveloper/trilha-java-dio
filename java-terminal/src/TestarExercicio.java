import java.util.Locale;
import java.util.Scanner;

public class TestarExercicio {
    public static void main(String[] args) {
        // Abaixo segue um exemplo de código que você pode ou não utilizar
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int PROD;
		
		System.out.println("Digite o primeiro valor");
		int A = sc.nextInt();

		System.out.println("Digite o segundo valor");
		int B = sc.nextInt();
		//TODO: Complete os espaços em branco com uma possível solução para o desafio 
		PROD = A * B;   

		System.out.println("PROD = " + PROD);
	}
}
