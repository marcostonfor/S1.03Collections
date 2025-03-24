package s3ejercicio1.nivell;

import java.util.ArrayList;

public class Month {
    private String name;
    public static ArrayList<Month> months = new ArrayList<Month>();

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static ArrayList<Month> getMonths() {
        return months;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonths(ArrayList<Month> months) {
        Month.months = months;
    }

    public static void addMonth(Month month) {
        months.add(month);

    }




}
