import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        //pruebas de los métodos en Iterativo.java
        //prueba ejer1:
        System.out.println("Suma iterativa de 5: " + Iterativo.suma(5));
        //prueba ejer2:
        System.out.println("Factorial iterativo de 5: " + Iterativo.factorial(5));
        //prueba ejer3:
        //NO ENTIENDO PORQ POTENCIA DA ERROR
        System.out.println("Potencia de 2 elevado a 3: " + potencia(2, 3));
        //prueba ejer4:
        int[] lista = {1, 2, 3, 4, 5, 6};
        System.out.println("Suma de pares recursiva en lista: " + Recursivo.sumaListaPares(lista, 0));
        //prueba ejer5:
        List<Integer> listaa = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Media de la lista: " + Iterativo.mediaLista(listaa));
        //prueba ejer6:
        //prueba ejer7:
        //prueba ejer8:
        //prueba ejer9:

        //pruebas de los métodos en Recursivo.java
        //prueba eje1:
        //prueba ejer2:
        //prueba ejer3:
        //prueba ejer4:
        //prueba ejer5:
        //prueba ejer6:
        //prueba ejer7:
        //prueba ejer8:
        //prueba ejer9:

    }
}
