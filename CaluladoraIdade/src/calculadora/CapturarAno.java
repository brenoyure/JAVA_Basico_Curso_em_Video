package calculadora;

import java.time.LocalDate;

public class CapturarAno {
    
    private int anoAtual;

    public int getAnoAtual() {
        LocalDate dataAtual = LocalDate.now();
        this.anoAtual = dataAtual.getYear();
        return anoAtual;
    }
    
   
}
