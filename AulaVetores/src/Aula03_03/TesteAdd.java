package Aula03_03;

public class TesteAdd {

	public static void main(String[] args) throws Exception {
		Vetor vetor = new Vetor(5);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		
		
	 }
	
}
