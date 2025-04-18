import java.util.ArrayList;
import java.util.List;
// EJERCICIOS RECURSIVIDAD: no se usan bucles, se usa un metodo que se llama asi mismo
public class Recursivo{
    
    //EJERCICIO 1: La suma 0 + 1 + 2 + ... + n.
    public static int suma(int n){
        //caso base: si n es 0, la suma es 0
        if (n==0){ 
            return 0;
        }
        //paso recursivo: se llama a suma: y suma n + la suma de los anteriores
        return n + suma(n-1);
    }

    //EJERCICIO 2: El factorial de un número.
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    //EJERCICIO 3: La potencia n-ésima de un número natural.
    public static int potencia(int base, int exponente){
        if (exponente == 0){
            return 1; //todo numero q tenga de exponente 0 te dara 1
        }
        return base * potencia(base, exponente-1);
    }

    //EJERCICIO 4: La suma de los elementos de una lista de números.
    public static int sumaLista(List<Integer>listaa){
        //caso base: si la lista está vacía, la suma es 0
        if (listaa.isEmpty()){
            return 0;
        }
        //paso recursivo: sumamos el primer elemento y llamamos recursivamente con el resto de la lista
            return listaa.get(0) + sumaLista(listaa.subList(1, listaa.size()));
    }
    

    //EJERCICIO 5: La media aritmética de una lista de números.
    public static double mediaLista(List<Integer>listaa){
        //cogemos el codigo del ejer4
        if (listaa.isEmpty()){
            return 0;
        }int suma = sumaLista(listaa);  //llamamos al método sumaLista para obtener la suma
        return (double) suma / listaa.size();

    }

    //EJERCICIO 6: La desviación típica de una lista de números.

    //EJERCICIO 7: La suma de los primeros números pares hasta n asumiendo n ≥ 2. 
    //Por ejemplo, sumaPares(9) = 8 + 6 + 4 + 2 = 20.
    public static int sumaPares(int n){
        if(n==2){
            return 2;
        }
        if(n % 2==0){
            return n + sumaPares(n-2);
        }
        return sumaPares(n-1); //si es impar, resta 1 para hacerlo par y luego sumas
     }

    //EJERCICIO 8: La suma de los elementos pares de una lista de enteros. 
    //Por ejemplo, sumaPares([1, 2, 3, 4]) = 6.  

    public static int sumaListaPares(int[] arr, int posicion) {
        if (posicion == arr.length) {
        return 0;
    }
        if (arr[posicion] % 2 == 0) {
        return arr[posicion] + sumaListaPares(arr, posicion + 1);
    }else{
        return sumaListaPares(arr, posicion + 1);
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
    public static List<Integer> ObtenerListaPar(ArrayList<Integer> lista, int posicion) {
        List<Integer> listaPar = new ArrayList<>();  //lista para almacenar los pares
        if (posicion >= lista.size()) {
            //caso base: si la posición es mayor o igual al tamaño de la lista, retornamos la lista vacía
            return listaPar;  
        } else {
            //verificamos si el número en la posición actual es par
            if (lista.get(posicion) % 2 == 0) {
                listaPar.add(lista.get(posicion));  //si el num es par, añadimos a la lista
            }
            //llamada recursiva
            listaPar.addAll(ObtenerListaPar(lista, posicion + 1));
            return listaPar;
        }
    }
    
    

}

