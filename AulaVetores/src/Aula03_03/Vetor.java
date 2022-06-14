package Aula03_03;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	
	public int tamanho;
		
	public Vetor(int capacidade) {
		elementos = new String[capacidade];
		tamanho = 0;			
		}
		
	public void adiciona(String elemento) throws Exception {		
		if(tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
		}else {
			throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
		}
		
		for(int i = 0 ; i < elementos.length ; i++ ) {	
			if(elementos[i] == null) {
				elementos[i] = elemento;
				break;

			}
		}
		
	}
	
	public boolean adiciona(int posicao, String elemento)	{
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		this.aumentaCapacidade();
		//mover todos os elementos
		for (int i = this.tamanho-1 ; i >= posicao; i--)	{
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}
	
	public void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length)	{
			String [] elementosNovos = new String[this.elementos.length +1];
			for(int i = 0 ; i < this.elementos.length; i++)	{
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public void remove(int posicao)	{
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		for (int i = 0 ; i < this.tamanho - 1 ; i++) {
			this.elementos[i] = this.elementos[i--];
		}
		this.tamanho --;
	}
	
	@Override
	public String toString() {
		return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
	}
	
	public String busca(int posicao)	{
		
		if	(!(posicao >= 0 && posicao < tamanho))	{			
			
			throw new IllegalArgumentException("Posição Inválida");
	
		}
		return this.elementos[posicao];
		
	}
			
	public int busca(String elemento) {
		for (int i = 0 ; i < this.tamanho ; i++)	{
			if (this.elementos [i].equals(elemento))	{
				return i;
			}
		}
		return -1;
	}
	
	
	
	}
		

		

	
