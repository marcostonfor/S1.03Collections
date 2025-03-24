package s3ejercicio1.nivell1;

import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        Month month = new Month("");
        month.addMonth(new Month("Enero"));
        month.addMonth(new Month("Febrero"));
        month.addMonth(new Month("Marzo"));
        month.addMonth(new Month("Abril"));
        month.addMonth(new Month("Mayo"));
        month.addMonth(new Month("Junio"));
        month.addMonth(new Month("Julio"));
        month.addMonth(new Month("Septiembre"));
        month.addMonth(new Month("Octubre"));
        month.addMonth(new Month("Noviembre"));
        month.addMonth(new Month("Diciembre"));
        month.addMonth(new Month("Enero"));

        for(Month mon : Month.months) {
            System.out.println(mon.getName()); // Valor repetido sin Agosto.
        }
        System.out.println("\n");
        Month.months.add(7, new Month("Agosto"));

        for(Month m : Month.months) {
            System.out.println(m.getName()); // Valor repetido con Agosto.
        }

        Set<Month> months = new HashSet<>(Month.months);



        System.out.println("\nDentro del HashSet:");

        for(Month element : months) {
            System.out.println(element.getName()); // Valores unicos del HashSet().
        }
    }
}
