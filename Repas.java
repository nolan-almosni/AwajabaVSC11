import com.awa.awajaba;
import com.awa.awajaba.metier;

public class Repas {
    
    private int numero;
    private LocalDate date;

    public Repas(int numero, LocalDate date){
        this.numero = numero;
        this.date = date;
    }

    public getNumero(){
        return this.numero;
    }

    public setNumero( int numero ){
        this.numero = numero;
    }

}
