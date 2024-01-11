//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Funzionalita.Dipendente;

public class EsercizioUno {
    public static void main(String[] args) {

Dipendente Marco = new Dipendente("Marco",22334456, "OPERAIO");
        Dipendente Gianni = new Dipendente("Gianni",1000,11223454,20.5,"OPERAIO","PRODUZIONE" );
        Gianni.setPromozione("OPERAIO");
        Gianni.setImportoOrarioStraordinario(30.5);
        Gianni.setDipartimento("Amministrazione");
        System.out.println("Dati di "+Gianni.getNome()+": "+"Stipendio "+Gianni.getStipendioBase()+" con uno Stipendio straordinario di: "+Gianni.getImportoOrarioStraordinario()+" del Dipartimento: "+Gianni.getDipartimento());
System.out.println("Dati di "+Marco.getNome()+": "+"Stipendio "+Marco.getStipendioBase());

Gianni.getDatiDipendente();
        }
    }
