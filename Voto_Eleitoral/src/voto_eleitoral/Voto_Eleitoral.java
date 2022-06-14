package voto_eleitoral;

import java.util.Scanner;

public class Voto_Eleitoral {

    public static void main(String[] args) {
        
        System.out.print("Insira seu ano de nascimento: ");
        Scanner teclado = new Scanner(System.in);
        int ano_Nascimento = teclado.nextInt();
        teclado.close();

        var anoAtual = CapturarAno.anoAtual();    
        var idade = anoAtual - ano_Nascimento;
        
        if (idade < 16) {
            System.out.println("Você tem " + idade + " anos. " +  "Não pode votar.");
        }else if(idade >= 16 && idade <18){
            System.out.println("Você tem " + idade + " anos. " + "Voto Opcional para jovens entre 16 e 18 anos.");
        }else if(idade >=18 && idade < 65) {
            System.out.println("Você tem " + idade + " anos. " + "Voto é Obrigatório para maiores de 18 anos.");
        }else{
            System.out.println("Você tem " + idade + " anos. " + "Voto Opcional para brasileiros acima de 65 anos.");
        }
        
    }
    
}
