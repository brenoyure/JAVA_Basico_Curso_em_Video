package voto_eleitoral;

import java.time.LocalDate;

public class CapturarAno {
    
    public static int anoAtual() {
              
       //Capturar Ano do Sistema e exibir no campo lblAnoAtual
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        return anoAtual;
    }
   
}
