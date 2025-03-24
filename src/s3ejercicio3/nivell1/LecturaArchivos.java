package s3ejercicio3.nivell1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LecturaArchivos {
    private Map<String, String> datosMapa;

    public LecturaArchivos() {
        this.datosMapa = new HashMap<>();
    }

    public String verArchivo(String urlArchivo) {
        String linea = "";
        try (BufferedReader archivo = new BufferedReader(new FileReader(urlArchivo))) {

            while ((linea = archivo.readLine()) != null) {
                String[] partes = linea.split("->", 2);
                if (partes.length == 2) {
                    this.datosMapa.put(partes[0].trim(), partes[1].trim());
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return linea;
    }

    public void mostrarMapa() {
        for(Map.Entry<String, String> entrada : datosMapa.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }

    public Map<String, String> getDatosMapa() {
        return this.datosMapa;
    }



}
