package numeros;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n, s = 0 ;
        String resposta;
        
        do {
            System.out.print("Digite um número:  ");
            n = teclado.nextInt();
            
            s += n;
            
            System.out.println("Quer continuar ? [S/N]");
            resposta = teclado.next();
        }while(resposta.equalsIgnoreCase("S"));
        System.out.println("A soma de todos os valores é " + s + ".");
        
        
    }
    
}
