package s3ejercicio2.nivell1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Start {
    public static void main(String[] args) {
        List<Integer> listaUno = new ArrayList<>();
        listaUno.add(11);
        listaUno.add(12);
        listaUno.add(13);
        listaUno.add(14);
        listaUno.add(15);

        System.out.println(listaUno);

        List<Integer> listaDos = new ArrayList<>();

        ListIterator<Integer> recorridoListas = listaUno.listIterator(listaUno.size());

        while(recorridoListas.hasPrevious()) {
            listaDos.add(recorridoListas.previous());

           // System.out.println(listaDos);
        }

        System.out.println(listaDos);
    }
}
