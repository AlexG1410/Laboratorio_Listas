import java.util.LinkedList;
import java.util.List;


class Persona {
        String nombre;
        String cedula;

        public Persona(String nombre, String cedula) {
            this.nombre = nombre;
            this.cedula = cedula;
        }

        @Override
        public String toString() {
            return nombre + " (Cédula: " + cedula + ")";
        }
    }

    public class ListaPersonasCedulaPar {
        public static void main(String[] args) {
            LinkedList<Persona> lista = new LinkedList<>();

            // Agregamos personas a la lista
            lista.add(new Persona("Juan", "123456"));
            lista.add(new Persona("Ana", "7890123"));
            lista.add(new Persona("Carlos", "456789"));
            lista.add(new Persona("María", "2345678"));

            // Obtener personas con cédula de longitud par
            List<Persona> personasCedulaPar = obtenerPersonasConCedulaPar(lista);

            // Imprimir el resultado
            System.out.println("Personas con cédula de longitud par: " + personasCedulaPar);
        }

        public static List<Persona> obtenerPersonasConCedulaPar(LinkedList<Persona> lista) {
            List<Persona> resultado = new LinkedList<>();
            for (Persona p : lista) {
                if (p.cedula.length() % 2 == 0) { // Verifica si la longitud de la cédula es par
                    resultado.add(p);
                }
            }
            return resultado;
        }
    }


