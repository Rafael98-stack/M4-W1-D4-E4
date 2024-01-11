package Funzionalita;

public class Dipendente {
    public String Nome;
    public double stipendioBase;
    private int Matricola;
    public  double importoOrarioStraordinario;

    public String Livello;

  private  String Dipartimento ;

    public Dipendente(String nome,double stipendioBase,int matricola,double importoOrarioStraordinario,String livello
            , String Dipartimento) {
        this.Nome= nome;
        this.stipendioBase= stipendioBase;
        this.Matricola=matricola;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.Livello=livello;
        this.Dipartimento =  Dipartimento;

    }

    public  Dipendente (String nome, int matricola, String dipartimento){
        this.Nome=nome;
        this.Matricola=matricola;
        this.Dipartimento=dipartimento;
        this.stipendioBase = 1000;
        this.importoOrarioStraordinario= 40.5;
        this.Livello = "OPERAIO";

    }


    public String getNome(){
        return this.Nome;
    }
    public double getStipendioBase(){
        return  this.stipendioBase;
    }
    public int getMatricola(){
        return this.Matricola;
    }
    public double getImportoOrarioStraordinario(){
        return this.importoOrarioStraordinario;
    }
    public void setImportoOrarioStraordinario(double importoOrarioStraordinarioModificabile){
        this.importoOrarioStraordinario = importoOrarioStraordinarioModificabile;
    }
    public String getLivello() {
        return this.Livello;
    }
    public String getDipartimento() {
        return this.Dipartimento;
    }
    public void setDipartimento(String dipartimentoModificabile) {
        this.Dipartimento= dipartimentoModificabile;
    }

    public void getDatiDipendente(){
        System.out.println("Nome: "+this.Nome+" Stipendio: "+this.stipendioBase+" Stipendio straordinario: "+this.importoOrarioStraordinario+" Livello: "+this.Livello+" Dipartimento: "+this.Dipartimento);
    }
    public void setPromozione(String livello){
final String  Operaio = "OPERAIO";
        final     String Impiegato = "IMPIEGATO";
        final      String Quadro = "QUADRO";
        final      String Dirigente = "DIRIGENTE";
        final String livelloMassimo = "Oltre il Dirigente c'e il capo";
        final String noImpiego="Impiego non riconosciuto";
switch( livello){
    case Operaio:
       this.Livello = Impiegato;
       this.stipendioBase += 200;
        break;
    case Impiegato:
        this.Livello = Quadro;
        this.stipendioBase += 500;
        break;
    case Quadro:
        this.Livello = Dirigente;
        this.stipendioBase += 1000;
        break;
    case Dirigente:
        this.Livello = livelloMassimo;
        break;
    default:
        this.Livello = noImpiego;
    }
    }
}
