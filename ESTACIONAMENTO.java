package aulas;
import java.util.Scanner;
public class ESTACIONAMENTO {
	 //EXERCICIO ESTACIONAMENTO
	public static void main(String[] args) {
		 Scanner entrada = new Scanner (System.in);
	        
	        int idoso, gestante, deficiente; // criei variaveis com os respectivos nomes
	        
	        System.out.println("Você é Idoso? se SIM digite 1, se NÃO digite 2"); // println para perguntar para o usuario e ele responder na linha de baixo
	        
	        idoso = entrada.nextInt(); // idoso recebe o scanner que vai guardar o valor que o usuario digitar
	        
	        System.out.println("Você é uma pessoa com Deficiencia? se SIM digite 1, se NÃO digite 2"); // println para perguntar para o usuario e ele responder na linha de baixo

			deficiente = entrada.nextInt(); // deficiente recebe o scanner que vai guardar o valor que o usuario digitar
			
			System.out.println("Você é Gestante? se SIM digite 1, se NÃO digite 2"); // println para perguntar para o usuario e ele responder na linha de baixo
			
			gestante = entrada.nextInt(); // gestante recebe o scanner que vai guardar o valor que o usuario digitar
			
			
			if (idoso == 1 || gestante == 1 || deficiente ==1){ // se idoso, gestante, deficiente for igual a 1, mostrar println dizendo que esta apto
				
				
				System.out.println("Você esta apto para estacionar na vaga"); // mostrar println dizendo que esta apto
				
			} else System.out.println("Você não esta apto para estacionar na vaga"); // mostrar println dizendo que NAO esta apto
			
			entrada.close(); // fechei o SCANNER		

	}

}
