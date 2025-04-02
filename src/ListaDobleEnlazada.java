import java.util.LinkedList;

public class ListaDobleEnlazada {

        public static void main(String[] args) {
            LinkedList<Integer> lista = new LinkedList<>();

            // Agregamos elementos a la lista
            lista.add(10);
            lista.add(15);
            lista.add(20);
            lista.add(25);
            lista.add(30);
            lista.add(35);

            // Imprimir la lista en orden inverso
            imprimirHaciaAtras(lista);
        }

        public static void imprimirHaciaAtras(LinkedList<Integer> lista) {
            System.out.print("Lista en orden inverso: ");
            for (int i = lista.size() - 1; i >= 0; i--) {
                System.out.print(lista.get(i) + " ");
            }
            System.out.println();
        }
    }

