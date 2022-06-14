package escolhapernas;

import java.util.Scanner;

public class EscolhaPernas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String tipo;
        int opcao_Continuar;
        
        do{
        System.out.print("Quantas patas você possui?  "); 
        int pernas = teclado.nextInt();


         switch (pernas) {
            
            case 1 -> {
                tipo = "Saçi";
                System.out.println("Você é um " + tipo + ".");
                System.out.println("Quer continuar ? Digite 1 para Sim ou qualquer valor (inteiro) para não");
                }
            
            case 2 -> {
                tipo = "Bípede";
                System.out.println("Você é um " + tipo + ".");
                System.out.println("Quer continuar ? Digite 1 para Sim ou qualquer valor (inteiro) para não");
                }
            
            case 4 -> {
                tipo = "Quadrúpede";
                System.out.println("Você é um " + tipo + ".");
                System.out.println("Quer continuar ? Digite 1 para Sim ou qualquer valor (inteiro) para não");
                }
            
            case 6,8 -> {
                tipo = "Aranha";
                System.out.println("Você é um " + tipo + ".");
                System.out.println("Quer continuar ? Digite 1 para Sim ou qualquer valor (inteiro) para não");
                }
            
            default -> {
                    tipo = "ET";
                    System.out.println("Você é um " + tipo + ".");
                    System.out.println("Caso queira reiniciar a execução do programa, digite 1");
                }
        }
opcao_Continuar = teclado.nextInt();
       
       }    while (opcao_Continuar == 1);
            teclado.close();
    }
    
}
