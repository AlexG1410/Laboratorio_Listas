import java.util.LinkedList;
import java.util.List;

public class ListaEnlazadaImpares {

        public static void main(String[] args) {
            LinkedList<Integer> lista = new LinkedList<>();

            // Agregamos elementos a la lista
            lista.add(10);
            lista.add(20);
            lista.add(30);
            lista.add(40);
            lista.add(50);
            lista.add(60);

            // Obtener elementos en posiciones impares
            List<Integer> impares = obtenerNumerosEnPosicionesImpares(lista);

            // Imprimir el resultado
            System.out.println("Números en posiciones impares: " + impares);
        }

        public static List<Integer> obtenerNumerosEnPosicionesImpares(LinkedList<Integer> lista) {
            List<Integer> resultado = new LinkedList<>();
            for (int i = 0; i < lista.size(); i++) {
                if (i % 2 == 0) { // Índices impares en base 1 (pares en base 0)
                    resultado.add(lista.get(i));
                }
            }
            return resultado;
        }
    }


