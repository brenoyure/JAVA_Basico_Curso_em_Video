package aula06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] estados = new String [10];
		estados[0] = "AC";
		estados[1] = "BA";
		estados[2] = "CE";
		estados[3] = "DF";
		estados[4] = "AM";
		estados[5] = "PA";
		estados[6] = "AP";
		estados[7] = "PB";
		estados[8] = "RN";
		estados[9] = "SP";
		
		for(int i = 0 ; i < estados.length; i++)	{
			System.out.println("Estados " + i + ":" + estados[i]);
			
		}
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual sigla de estado deseja pesquisar?: ");

		String siglaBusca = leitor.nextLine();
		
		//busca linear
		
		boolean encontrou = false;
		
		for(int i = 0; i < estados.length; i++ )	{
			String elemento = estados[i];
			if (elemento.equalsIgnoreCase(siglaBusca)) {
				encontrou = true;
				break;
				
			}
						
		}
		
		if(encontrou == true)	{
			
			System.out.println("Encontrou");
		}else	{
			System.out.println("Valor não encontrado");
		}
		

	}

}
