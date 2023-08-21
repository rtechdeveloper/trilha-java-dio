import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		System.out.println("									");
		System.out.println("Processo Seletivo");
		System.out.println("									");
	
	selecaoCandidatos();
			
	}

	//SELECIONA OS CANDIDATOS
	public static void selecaoCandidatos() {
		String [] candidatos = {"PEDRO", "JOAO", "MARIA", "JOSE", "PAULO", 
						"JULIANA", "MIRELA", "AUGUSTO", "FABIO", "LUCAS"};
		
		int candSelect = 0;
		int candActual = 0;
		double salarioBase = 2000.0;
		ArrayList <String> lista = new ArrayList<String>();
		
		while (candSelect < 5 && candActual < candidatos.length) {
			String candidato = candidatos[candActual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " informou o salario pretendido no valor de " +salarioPretendido);
			if (salarioBase >= salarioPretendido) {

                lista.add (candidato);

				System.out.println("O candidato >>> " + candidato + " << foi selecionado para o processo");
				candSelect++;
			}
			candActual++;

		}
	
		System.out.println("									");
		System.out.println("||>>>> LISTA DOS SELECIONADOS <<<<||");
		System.out.println("									");
		
		for (String candidato: lista){
			System.out.println("O candidato selecionando é: " + candidato);
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	/**
	static void printList(String [] lista){

		for(int indice=0; indice < lista.length; indice++ ){
			System.out.println("O candidato de nº " + indice + " é o " + lista);

		System.out.println("									");
		System.out.println("||>>>> LISTA DOS SELECIONADOS <<<<||");
		System.out.println("Os candidatos selecionados são: " + lista.toString());

		for (String candidato: lista){
			System.out.println("O candidato selecionando é: " + candidato);
		}
		}		
	}
	//daqui para baixo nao esta sendo executado
	/**static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
			
		}else if(salarioBase == salarioPretendido)
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		
		else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}	
	}*/
}
