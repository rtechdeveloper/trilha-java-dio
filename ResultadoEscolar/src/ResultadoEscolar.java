public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        
        double nota = 4;
        
        // Exemplo de condicao ENCADEADA (if, else if e else).
        if (nota >= 7){
            System.out.println("COND ENCADEADA: Aluno APROVADO!");
        }else if (nota >= 5 && nota < 7){
            System.out.println("COND ENCADEADA: Aluno em Recuperação!");
        }else
            System.out.println("COND ENCADEADA: Aluno REPROVADO!");
        
        //Exemplo de condicao TERNARIA SIMPLES (? = true : = false)
        String resultado = nota >= 7 ? "Aprovado!" : "Reprovado!";
        System.out.println("COND TERNARIA SIMPLES: " + resultado);

        //Exemplo de condicao TERNARIA ENCADEADA (? = true : = false ? = true : = false)
        resultado = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "RECUPERACAO!" : "Reprovado!";
        System.out.println("COND TERNARIA ENCADEADA: " + resultado);
    
    }
}
