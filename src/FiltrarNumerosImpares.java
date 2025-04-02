import java.util.LinkedList;
import java.util.List;

public class FiltrarNumerosImpares {

        public static void main(String[] args) {
            LinkedList<Integer> lista = new LinkedList<>();

            // Agregamos elementos a la lista
            lista.add(10);
            lista.add(15);
            lista.add(20);
            lista.add(25);
            lista.add(30);
            lista.add(35);

            // Obtener lista con números impares
            List<Integer> impares = obtenerNumerosImpares(lista);

            // Imprimir la lista resultante
            System.out.println("Lista de números impares: " + impares);
        }

        public static List<Integer> obtenerNumerosImpares(LinkedList<Integer> lista) {
            List<Integer> resultado = new LinkedList<>();
            for (Integer num : lista) {
                if (num % 2 != 0) {
                    resultado.add(num);
                }
            }
            return resultado;
        }
    }

