import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        
        double mesada = 50.0;

        while (mesada > 0){
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada){
                valorDoce = mesada;
            }

            System.out.println("O valo do doce: " + valorDoce + " Adicionado ao carrinho!" );
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada é: " + mesada);
        System.out.println("Joazinho gastou toda a mesada!!!");

    }
    //method for random value
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
