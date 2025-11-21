import java.util.*;



    static class Empleado {
        String nombre;
        int salario;

        public Empleado(String nombre, int salario) {
            this.nombre = nombre;
            this.salario = salario;
        }

        // Getters y toString para que se vea bonito al imprimir
        public String getNombre() { return nombre; }
        public int getSalario() { return salario; }

        @Override
        public String toString() { return nombre + " ($" + salario + ")"; }
    }

    List<Empleado> lista = Arrays.asList(
            new Empleado("Carlos", 3000),
            new Empleado("Ana", 5000),
            new Empleado("Beatriz", 4000)
    );

    public void main() {
        Collections.sort(lista,Comparator
                .comparingInt(Empleado::getSalario)
                .thenComparing(Empleado::getNombre));

//Crear una lista solo con los nombres de quienes ganan más de 3500
       lista.stream().filter(Empleado -> Empleado.getSalario() > 3500)
               .map(Empleado::getNombre)
               .toList();
        lista.forEach(System.out::println);
    }



