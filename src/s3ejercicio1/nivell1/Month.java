package s3ejercicio1.nivell1;

import s3ejercicio1.nivell2.Restaurant;

import java.util.ArrayList;
import java.util.Objects;

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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Month that = (Month) obj;
        return Objects.equals(name, that.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }


}
