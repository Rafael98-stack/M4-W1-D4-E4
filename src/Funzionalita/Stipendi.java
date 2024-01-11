package Funzionalita;

public enum Stipendi {

    IMPIEGATO(1200.0),
    QUADRO(1500.0),
    DIRIGENTE(2000.0);
private final double Importo;
Stipendi( double importo) {
    this.Importo = importo;
}
public double getStipendio() {
    return this.Importo;
}
}
