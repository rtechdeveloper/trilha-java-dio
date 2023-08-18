public class SistemaMedidas {
    public static void main(String[] args) {
        String tamanho = "GG";

        // se não colocar o break em cada case, o sistema ira rodar todos os cases a partir do que ele encontrar na condicao.
        //exemplo: se não tiver o break no case G o sistema ira gerar a saida da opcao G até achar o proximo break ou até finalizar o switch.
        switch (tamanho){
            case "P":{
                System.out.println("Seu tamanho é: 00-38 cm (P)Pequeno/(S)Small Size");
                break;
            }
            case "M":{
                System.out.println("Seu tamanho é: 39-40 cm (M)Médio/(M)Avarega Size");
                break;
            }
            case "G":{
                System.out.println("Seu tamanho é: 41-42 cm (G)Grande/(L)Large Size");
                break;
            }    
            case "GG":{
                System.out.println("Seu tamanho é: 43-44 cm (GG)Extra Grande/(XL)Extra Large Size");
                break;
            } 
            default:{
                System.out.println("Seu tamanho é feito por encomenda!!!");
            }        
        }
    }
}
