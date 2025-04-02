import java.util.LinkedList;

public class EliminarNumerosPares {

        public static void main(String[] args) {
            LinkedList<Integer> lista = new LinkedList<>();

            // Agregamos elementos a la lista
            lista.add(10);
            lista.add(15);
            lista.add(20);
            lista.add(25);
            lista.add(30);
            lista.add(35);

            // Eliminar números pares
            eliminarNumerosPares(lista);

            // Imprimir la lista resultante
            System.out.println("Lista después de eliminar los números pares: " + lista);
        }

        public static void eliminarNumerosPares(LinkedList<Integer> lista) {
            lista.removeIf(num -> num % 2 == 0);
        }
    }


