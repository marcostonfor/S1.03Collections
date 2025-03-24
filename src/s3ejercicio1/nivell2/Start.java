package s3ejercicio1.nivell2;

import java.util.HashSet;

public class Start {
    public static HashSet<Restaurant> restaurants = new HashSet<>();
    public static void main(String[] args) {
        Restaurant  oneRestaurant = new Restaurant("El Colmillo", 8);
        Restaurant otherRestaurant = new Restaurant("El Carnivoro", 6);
        Restaurant restaurant3 = new Restaurant("La paella", 7);
        Restaurant restaurant4 = new Restaurant("El Colmillo", 8);

        addRestaurant(restaurants, oneRestaurant);
        addRestaurant(restaurants, otherRestaurant);
        addRestaurant(restaurants, restaurant3);
        addRestaurant(restaurants, restaurant4);

    }

    public static void addRestaurant(HashSet<Restaurant> restaurants, Restaurant restaurant) {
        if(restaurants.add(restaurant)) {
            System.out.println("Se ha añadido el restaurante " + restaurant.getName());
        } else {
            System.out.println("No se pudo añadir el restaurante duplicado " + restaurant.getName());
        }
    }
}
