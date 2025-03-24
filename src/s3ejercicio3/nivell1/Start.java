package s3ejercicio3.nivell1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Start {
    public static Scanner datos = new Scanner(System.in);
    public static void main(String[] args) {
        LecturaArchivos datosPais = new LecturaArchivos();
        String pais = datosPais.verArchivo("src/s3ejercicio3/nivell1/paises.txt");
        int pregunta = 0;
        String nom = "";
        String capital = "";
        String archivoResultado = "resultado.txt";
        do {
            System.out.println("Escriba su nombre.");
            nom = datos.next();

            List<String> valores = new ArrayList<>(datosPais.getDatosMapa().values());

            Random paisAleatorio = new Random();
            int indice = paisAleatorio.nextInt(valores.size());
            String valor = valores.get(indice);
            System.out.println("La capital del pais " + valor + " es\n Responda a continuacion.");
            capital = datos.next();

            try(BufferedWriter writer = new BufferedWriter(new FileWriter(archivoResultado, true))) {
                writer.write("Nombre: " + nom + ".\n Respuesta: " + capital + " es la capital de " + valor);
                writer.newLine();
                System.out.println("Se guardo la respuesta de " + nom);
            } catch (IOException e){
                e.printStackTrace();
                System.out.println("Ocurrió un error al guardar la información.");
            }

            pregunta++;
        }while(pregunta <= 10);
    }


}
/*
* Donat el fitxer countrties.txt (revisa l'apartat recursos) que conté països i capitals.
* El programa ha de llegir el fitxer i guardar les dades en un HashMap<String, String>.
* l programa demana el nom de l’usuari/ària, i després ha de mostrar un país de forma aleatòria,
* guardat en el HashMap. Es tracta que l’usuari/ària ha d’escriure el nom de la capital del país en qüestió.
* Si l’encerta se li suma un punt. Aquesta acció es repeteix 10 vegades. Un cop demanades les capitals
* de 10 països de forma aleatòria, llavors s’ha de guardar en un fitxer anomenat classificacio.txt,
* el nom de l’usuari/ària i la seva puntuació.
* */