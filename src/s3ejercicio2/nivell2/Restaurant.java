package s3ejercicio2.nivell2;
import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Restaurant that = (Restaurant) obj;
        return score == that.score && Objects.equals(name, that.name);
    }

    public int hashCode() {
        return Objects.hash(name, score);
    }

    public String toString(){
        return "El restaurante " + this.name + " tiene una puntuacion de " + this.score + " puntos.";
    }
}
