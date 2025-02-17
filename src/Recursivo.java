import java.util.ArrayList;
import java.util.List;

public class Recursivo{
    // EJERCICIOS RECURSIVIDAD

    //EJERCICIO 1: La suma 0 + 1 + 2 + ... + n.

    //EJERCICIO 2: El factorial de un número.

    //EJERCICIO 3: La potencia n-ésima de un número natural.

    //EJERCICIO 4: La suma de los elementos de una lista de números.

    //EJERCICIO 5: La media aritmética de una lista de números.

    //EJERCICIO 6: La desviación típica de una lista de números.

    //EJERCICIO 7: La suma de los primeros números pares hasta n asumiendo n ≥ 2. 
    //Por ejemplo, sumaP ares(9) = 8 + 6 + 4 + 2 = 20.

    //EJERCICIO 8: La suma de los elementos pares de una lista de enteros. 
    //Por ejemplo, sumaP ares([1, 2, 3, 4]) = 6.  

    
    public static int sumaListaPares(int[] arr, int index) {
        if (index == arr.length) {
        return 0;
    }
        if (arr[index] % 2 == 0) {
        return arr[index] + sumaListaPares(arr, index + 1);
    }else{
        return sumaListaPares(arr, index + 1);
    }
}
        //toma como entrada una lista de enteros arr y un índice index y devuelve la suma de los elementos pares de la lista.
        //El caso base cuando index=longitud de la lista, lo que significa que se ha recorrido toda la lista. 
        //En ese caso, se devuelve 0.
        //En cualquier otro caso, se comprueba si el elemento actual en la lista es par.
        //Si es así, se devuelve el elemento actual más la suma de los elementos pares restantes.
        //De lo contrario, se devuelve la suma de los elementos pares restantes.

    /* 
    //CORRECCION EJER8 EN CLASE:
    sumaPares(ArrayList<Integer> lista, int indice){
        if (indice >= lista.size()){

        }else{
            lista.get(indice)%2==0{
                return lista + sumaPares(lista, indice + 1);
            }
        }
    }
*/

    //EJERCICIO 9: dada una lista, obten otra lista con los numeros pares de la lista original
    public static List<Integer> ObtenerListaPar(ArrayList lista1, ArrayList lista2, posicion) {
        if (posicion %2 ==0){
            return posicion.add(lista2);
        }else{
            return ObtenerListaPar(lista2);
        }
    }
    

    //metodo main
    public static void main(String args[]) {
        System.out.println("Hola mundo");
    }


}

