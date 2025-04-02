import java.util.LinkedList;

public class ContarOcurrencias {

        public static void main(String[] args) {
            LinkedList<Integer> lista = new LinkedList<>();

            // Agregamos elementos a la lista
            lista.add(10);
            lista.add(15);
            lista.add(20);
            lista.add(15);
            lista.add(30);
            lista.add(15);

            // Contar ocurrencias de un número específico
            int valor = 15;
            int ocurrencias = contarOcurrencias(lista, valor);

            // Imprimir el resultado
            System.out.println("El número " + valor + " se repite " + ocurrencias + " veces en la lista.");
        }

        public static int contarOcurrencias(LinkedList<Integer> lista, int valor) {
            int contador = 0;
            for (Integer num : lista) {
                if (num == valor) {
                    contador++;
                }
            }
            return contador;
        }
    }

