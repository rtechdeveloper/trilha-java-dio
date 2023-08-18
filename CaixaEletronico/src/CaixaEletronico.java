public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        //Exemplo de condicao SIMPLES (somente o if)
        double saldo = 25.0;
        double valorSolicitado = 11;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }else  
            // Exemplo do condicao COMPOSTA (if E else) 
            System.out.println("Seu saldo é insuficiente!");

        System.out.println("Seu saldo atual é: " + saldo);


    }
}
