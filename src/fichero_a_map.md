# Aquí tienes un ejemplo de una clase en Java que lee un archivo `.txt` y almacena su contenido en un `HashMap`.

## Se asume que el archivo tiene datos en formato `clave=valor`, aunque puedes modificarlo según tus necesidades.

### Implementación en Java:
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileToHashMap {
    private Map<String, String> dataMap;

    public FileToHashMap() {
        dataMap = new HashMap<>();
    }

    public void loadFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("=", 2); // Divide en clave=valor
                if (parts.length == 2) {
                    dataMap.put(parts[0].trim(), parts[1].trim()); // Agregar al HashMap
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void printData() {
        for (Map.Entry<String, String> entry : dataMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public Map<String, String> getDataMap() {
        return dataMap;
    }

    public static void main(String[] args) {
        FileToHashMap fileReader = new FileToHashMap();
        fileReader.loadFile("datos.txt"); // Cambia "datos.txt" por la ruta de tu archivo
        fileReader.printData();
    }
}
```
### Explicación:
1. **`FileToHashMap`**: Clase que contiene un `HashMap<String, String>` para almacenar los datos.
2. **`loadFile(String filePath)`**: Lee el archivo línea por línea y lo guarda en el `HashMap`.
3. **`printData()`**: Imprime los datos almacenados.
4. **`getDataMap()`**: Devuelve el `HashMap` con los datos cargados.
5. **`main`**: Ejecuta la lectura y muestra los datos almacenados.

📌 **Ejemplo de archivo `datos.txt`**:
```
nombre=Juan
edad=25
ciudad=Madrid
```
📌 **Salida esperada**:
```
nombre : Juan
edad : 25
ciudad : Madrid
```

Si necesitas algún ajuste, dime cómo quieres personalizarlo. 🚀

