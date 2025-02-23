
import java.util.List;

public class Iterativo {
    
//EJERCICIO 1: La suma 0 + 1 + 2 + ... + n.
public static int suma(int n){

    int sumaTotal = 0;
    for(int i=0; i<=n; i++){
        sumaTotal = sumaTotal + i;
    }
    return sumaTotal;
}


//EJERCICIO 2: El factorial de un número.
public static int factorial(int n){

    int variable = 1;
    for(int i=1; i<=n; i++){
        variable = variable * i;
    }return variable;
}

//EJERCICIO 3: La potencia n-ésima de un número natural.
public static int potencia(int base, int exponente, int j){
    int result=1;
    for(int i=1; i<=exponente; i++){
        result = result * base;
    }
    return result;
}

//EJERCICIO 4: La suma de los elementos de una lista de números.
public static int sumaLista(List<Integer>listaa){
    int suma = 0;
    for(int i=0; i<=listaa.size(); i++){
        suma += listaa.get(i);  //sumar cada elemento = suma = suma + listaa.get(i);
        }
        return suma;

    }

//EJERCICIO 5: La media aritmética de una lista de números.
//sumo cada elemnto de la lista y luego divido por el num de elemntos q tenga la lista
public static double mediaLista(List<Integer>listaa){
    int suma = 0;
    for(int i=0; i<=listaa.size(); i++){
        suma = suma + listaa.get(i);
    }
    return suma/listaa.size(); //NO ENTIENDO DIFERENCIA ENTRE SIZE Y LENGTH
}

//EJERCICIO 6: La desviación típica de una lista de números.

//EJERCICIO 7: La suma de los primeros números pares hasta n asumiendo n ≥ 2. 
//Por ejemplo, sumaP ares(9) = 8 + 6 + 4 + 2 = 20.

//EJERCICIO 8: La suma de los elementos pares de una lista de enteros. 
//Por ejemplo, sumaP ares([1, 2, 3, 4]) = 6.

//EJERCICIO 9: Dada una lista de números naturales mayores o iguales que 2, 
//obtiene otra lista con los números pares de la lista inicial, en el mismo orden y
//respetando los números repetidos. Por ejemplo, obtenerListaP ar([1, 2, 6, 11]) = [2, 6].

//EJERCICIO 10: La lista de los primeros números pares hasta n asumiendo n ≥ 2. 
//Por ejemplo, listaP ar(9) = [8, 6, 4, 2].

//EJERCICIO 11: Producto escalar de dos listas de números no vacías y del mismo tamaño. 
//Por ejemplo, calcularP roductoEscalar([1, 2, 3], [2, 4, 6]) = 1 · 2 +2 · 4 + 3 · 6 = 2 + 8 + 18 = 28

}
