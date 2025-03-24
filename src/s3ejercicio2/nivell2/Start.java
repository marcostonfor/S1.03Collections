package s3ejercicio2.nivell2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        List<Restaurant> restaurantes = new ArrayList<>();
        restaurantes.add(new Restaurant("Bistro", 5));
        restaurantes.add(new Restaurant("Zebra Grill", 4));
        restaurantes.add(new Restaurant("Almendra", 7));
        restaurantes.add(new Restaurant("Cantina", 6));

        // Ordenar por nombre en orden descendente
        restaurantes.sort(Comparator.comparing(Restaurant::getName));

        // Mostrar resultado
        for (Restaurant r : restaurantes) {
            System.out.println(r);
        }
    }
}
