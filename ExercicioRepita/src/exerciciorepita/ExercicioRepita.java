package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        
        int numero, qtdNumeros = 0;
        int media = 0;
        float mediaFloat;
        int numeroPar = 0;
        int numeroImpar = 0;
        int soma = 0;
        int acimaDe100 = 0;
        
        do {
//          Pedindo os números ao usuário            
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número, digite 0 para finalizar."));           
            
/*          Verifica se o número digitado é par. 
            Se sim, incrementa o contador de números pares. Caso não, incrementa o de impares.*/
            if (Integer.parseInt(Integer.toString(numero)) % 2 == 0) {
                numeroPar ++;
            }else numeroImpar++;

//          Verifica se o valor digitado é maior que 100;
            if (numero > 100) acimaDe100++;
            
//          Soma de todos os valores digitados.
            soma += numero;   
            
//          Incremetando a quantidade de números, na variável qtdNúmeros, a medida que o usuário os insere
            qtdNumeros++;
            
//          Média é a soma divida pela quantidade de números
            
            if(soma % qtdNumeros != 0){
//            Double.parseDouble(Integer.toString(media));
            Float.parseFloat(Integer.toString(soma,qtdNumeros));
            mediaFloat = Float.parseFloat(Float.toString(media));
            media = soma / qtdNumeros;
            
            }else media = soma /qtdNumeros;
                        
            
        }while (numero != 0);
        JOptionPane.showMessageDialog(null, 
                "<html>Resultado Final <br><hr>" + "<br>" +
               
                        "Números digitados: " + qtdNumeros + "<br>" +
                        "Soma dos valores inseridos é de " + soma + "<br>" +
                        "A média dos valores é de: " + media + "<br>" +         
                        "Números Pares: " + numeroPar + "<br>" +
                        "Números Impares: " + numeroImpar + "<br>" +
                        "Números maiores que 100: " + acimaDe100 + "</html>"
        
        
        
        );
        
        
        
        
    }
    
}
