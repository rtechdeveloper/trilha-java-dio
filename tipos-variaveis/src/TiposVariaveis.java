import java.util.Date;
/**
*
*RTECH - CURSO JAVA DIO - TIPOS DE VARIAVEIS 
*@version           ......: 1.0
*@program_Objective ......: DEMOSTRAR OS TIPOS DE VARIAVEIS
*@param             ......:                    
*@return            ......:
*@History           ......: EXEMPLO DE TIPOS DE VARIAVEIS          
*@since             ......: 14/08/2023     
*@author            ......: Rogério Amorim   
*
**/

public class TiposVariaveis {
    public static void main(String[] args) {

        // ---------------- TIPOS PRIMITIVOS ------------------
        byte um = 123;
        Short dois = 1234;
        int tres = 12345;
        long quatro = 123L;

        float quinto = 123.45f;
        double sexto = 123.45d;

        char setimo = '\u004a'; // , 'j';
        boolean oitavo = true;

        double salarioMinimo = 1320;

        Date dtaNasc = new Date(); // neste caso, e necessario usar o import da biblioteca Date (ex:import
                                   // java.util.Date) no inicio do programa.

        short numCurto = 1;
        int numNormal = numCurto;
        // neste caso ao tentar converter um int para short e necessario fazer o
        // casting, colocando o tipo da variavel antes do conteudo int.
        short numCurto2 = (short) numNormal;

        // exemplo de variavel que podem ser alteradas no decorrer do programa.
        int numero = 1;
        numero = 2;

        // exemplo de variavel que não pode sofrer modificacao, neste caso devemos usar
        // palavra reservada 'final' e colocar a variavel em uppercase.

        final int NUMERO99 = 100;
        // NUMERO99 = 10; neste caso apresentara um erro na execucao

        System.out.println(NUMERO99);

        // ----------------------------------------------------------------------------------------

        // -------------- CONDICIONAL ------------------------------
        int hora = 19;

        if (hora < 12) {
            System.out.println(dois);
        } else if (hora < 18) {
            System.out.println(dois);
        } else {
            System.out.println(dois);
        }

        char simbolo = '#';

        switch (simbolo) {
            case '$':
                System.out.println("Dola");
                break;
            case '#':
                System.out.println("Cerquilha");
                break;
            case '@':
                System.out.println("Arroba");
                break;
            default:
                System.out.println("Simbolo nao encontrado");
        }

        // ------------- LOOPS ---------------
        var i = 0;

        // WHILE
        while (i < 100) {
            i++;
            System.out.println("I:" + i);
        }

        // Do
        do {
            i++;
            System.out.println("I:" + i);
        } while (i < 100);

        // FOR
        for (int j = 0, o = 100; j < o; j += 2, o -= 3) {

            System.out.println("O:" + o);
            System.out.println("J:" + j);

        }

        System.out.println(dois);
    }
}
