package s3ejercicio1.nivell;

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

        Month.months.add(7, new Month("Agosto"));

        for(Month m : Month.months) {
            System.out.println(m.getName());
        }
    }
}
