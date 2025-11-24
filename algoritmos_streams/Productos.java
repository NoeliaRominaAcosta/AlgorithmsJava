package algoritmos_streams;

import java.util.Arrays;
import java.util.List;

public class Productos {
    List<Producto> productos = Arrays.asList(
            new Producto("Producto A", 150.0, true),
            new Producto("Producto B", 90.0, true),
            new Producto("Producto C", 200.0, false),
            new Producto("Producto D", 120.0, true)
    );

    /*
Filtrar isActive == true.
Filtrar price > 100.
Transformar a nombre en mayúsculas.
Recolectar en una lista.*/

    public List<String> obtenerNombresProductos() {
        return productos.stream()
                .filter(Producto::isActive)
                .filter(p -> p.getPrice() > 100)       
                .map(Producto::getName)
                .map(String::toUpperCase)             
                .toList();
    }
    
static void main(String[] args) {
    Productos productos = new Productos();
    List<String> nombresFiltrados = productos.obtenerNombresProductos();
    System.out.println(nombresFiltrados);
}
}
