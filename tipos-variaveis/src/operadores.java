public class Operadores {

    public static void main(String[] args) {
        // ------------- OPERADORES ------------------
        // ATRIBUICAO =
        double calc = 0;

        // ADICAO + ou CONCATENACAO DE STRINGS
        double somar = 10.5 + 15.7;
        String nomeCurso = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCurso);

        // SUBTRACAO -
        int subtrair = 113 - 25;
        System.out.println(subtrair);

        // MULTIPLICACAO *
        int multiplicar = 20 * 7;
        System.out.println(multiplicar);

        // DIVISAO /
        int dividir = 15 / 3;
        System.out.println(dividir);

        // RESTO DE DIVISAO %
        int modulo = 18 % 3;
        System.out.println(modulo);

        // REGRA DE PRECEDENCIA
        double resultado = (10 * 7) + (20 / 4);
        System.out.println(resultado);

        // -------------- OPERADORES UNARIOS --------------------
        // Incremento ++
        int numeroFor = 5;
        numeroFor++;

        System.out.println(numeroFor);

        // Decremento --
        numeroFor--;
        System.out.println("Decremento: " + --numeroFor);
        System.out.println("Decremento: " + numeroFor);

        // ! NOT
        boolean verdadeFalse = true;
        System.out.println(!verdadeFalse);

        // -------------- OPERADORES TERNARIOS --------------------
        // Logica ? "Verdade" : "Falso"

        int a = 10;
        int b = 01;

        String result = a == b ? "True" : "False";
        System.out.println("A é igual a B? " + result);

        // -------------- OPERADORES RELACIONAIS --------------------
        // IGUAL ==
        boolean simNao = a == b;
        System.out.println("IGUAL = " + simNao);

        // DIFERENTE !=
        simNao = a != b;
        System.out.println("DIFERENTE = " + simNao);

        // MAIOR QUE >
        simNao = a > b;
        System.out.println("MAIOR QUE = " + simNao);

        // MAIOR OU IGUAL >=
        simNao = a >= b;
        System.out.println("MAIOR ou IGUAL = " + simNao);

        // MENOR QUE <
        simNao = a < b;
        System.out.println("MENOR QUE = " + simNao);

        // MENOR OU IGUAL <=
        simNao = a <= b;
        System.out.println("MENOR ou IGUAL = " + simNao);

        // -------------- OPERADORES LOGICOS ---------------------
        boolean condition1 = false;
        boolean condition2 = true;

        // && AND - as duas condicoes sendo veradeiras entra no if
        if (condition1 && (7 > 4)) {
            System.out.println("The two contidion is true");
        } else {
            System.out.println("Fim!!!");
        }

        // || OR - uma das duas condicoes for verdadeira entrara no if.
        if (condition1 || condition2) {
            System.out.println("The once contidion is true");
        }

        System.out.println("Fim");

    }
}
