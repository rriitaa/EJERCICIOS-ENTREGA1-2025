import java.util.Arrays;
public class Principal {
    public static void main(String[] args) {
        /* 
        //pruebas de los métodos en Iterativo.java
        //prueba ejer1:
        System.out.println("Suma iterativa de 5: " + Iterativo.suma(5));
        //prueba ejer2:
        System.out.println("Factorial iterativo de 5: " + Iterativo.factorial(5));
        //prueba ejer3:
        //NO ENTIENDO PORQ POTENCIA DA ERROR
        System.out.println("Potencia de 2 elevado a 3: " + Iterativo.potencia(2, 3));
        //prueba ejer4:
        int[] lista = {1, 2, 3, 4, 5, 6};
        System.out.println("Suma de pares recursiva en lista: " + Iterativo.sumaListaPares(lista, 0));
        //prueba ejer5:
        System.out.println("la media de la lista es:" + Iterativo.mediaLista(Arrays.asList(1, 2, 3, 4, 5)));
        //prueba ejer6:
        System.out.println("la desviacion tipica es: " + Iterativo.desviacionTipica(Arrays.asList(1, 2, 3, 4, 5)));
        //prueba ejer7:
        System.out.println("la suma par es: " + Iterativo.sumaPares(9));
        //prueba ejer8:
        System.out.println("la suma par de la lista es: +" + Iterativo.sumaListaPares(Arrays.asList(1, 2, 3, 4, 5)));
        //prueba ejer9:
*/

        //pruebas de los métodos en Recursivo.java
        //prueba eje1:
        System.out.println("La suma es: " + Recursivo.suma(5));
        //prueba ejer2:
        System.out.println("el factorial es: " + Recursivo.factorial(5));
        //prueba ejer3:
        // Ejercicio 3: Potencia n-ésima
        System.out.println("La potencia es: " + Recursivo.potencia(2, 3)); //2^3 = 8
        //prueba ejer4:
        //List<Integer> listaa = List.of(1, 2, 3, 4, 5);
        //System.out.println("La suma de la lista es: " + Recursivo.sumaLista(listaa)); //1 + 2 + 3 + 4 + 5 = 15
        //prueba ejer5:
        System.out.println("La media de la lista es: " + Recursivo.mediaLista(listaa)); //media = (1+2+3+4+5)/5 = 3.0
        //prueba ejer6:
        //prueba ejer7:
        System.out.println("la suma par es: " + Recursivo.sumaPares(9));
        //prueba ejer8:
        //prueba ejer9:
        

        //pruebas de los métodos ExpresionesLambda.java
        //prueba eje1:
        //prueba ejer2:
        //prueba ejer3:
        //prueba ejer4:
        //prueba ejer5:
        //prueba ejer6:
        //prueba ejer7:
        //prueba ejer8:
        //prueba ejer9: 
        System.out.println("Los números pares son: " + ExpresionLambda.obtenerListaPar(Arrays.asList(1, 2, 6, 11)));


    }
}
