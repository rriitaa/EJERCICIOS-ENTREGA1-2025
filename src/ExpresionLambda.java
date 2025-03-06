import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//EXPRESION LAMBDA: (parametros) -> { cuerpo de la expresión }
//(0, (x, y) -> {return x+y;})
//(0, (x, y) -> {x+y;})
//Parámetros: Son los valores que recibe la función (como en un método normal).
//cuerpo de la expresión:la lógica que ejecutará la función y puede ser 1 línea o bloque { } con varias línea
public class ExpresionLambda {
    // EJERCICIO 1: La suma 0 + 1 + 2 + ... + n.

    // EJERCICIO 2: El factorial de un número.
    // primero hacemos el arrayList
    public static int factorial(int n) {
        ArrayList<Integer> listaa = new ArrayList();
        listaa.add(1);
        listaa.add(2);
        listaa.add(3);
        listaa.add(4);
        listaa.add(5);
        // ahora hacemos la lista de streams
        int result = listaa.stream().reduce(1, (x, y) -> { return x * y;});
        return result;
    }

    // EJERCICIO 3: La potencia n-ésima de un número natural.
    // EJERCICIO 4: La suma de los elementos de una lista de números.
    // EJERCICIO 5: La media aritmética de una lista de números.
    public static double mediaLista(List<Double>listaa){
        return listaa.stream().reduce(0.0, 
        (x, y)-> x+y / listaa.size());
    }
    
//EJERCICIO 6: La desviación típica de una lista de números.
//EJERCICIO 7: La suma de los primeros números pares hasta n asumiendo n ≥ 2. Por
//ejemplo, sumaPares(9) = 8 + 6 + 4 + 2 = 20.
//EJERCICIO 8:La suma de los elementos pares de una lista de enteros.
//ejemplo: sumaPares([1, 2, 3, 4]) = 6.

//EJERCICIO 9:Dada una lista de números naturales mayores o iguales que 2, obtieneotra lista 
//con los números pares de la lista inicial, en el mismo orden y respetando los números 
//repetidos. Por ejemplo, obtenerListaPar([1, 2, 6, 11]) = [2, 6]
public static List<Integer> obtenerListaPar(List<Integer>listaa){
    return listaa.stream()
                    .filter(n -> n % 2 == 0) //filtra numeros pares
                    .collect(Collectors.toList()); //convertir a una lista
}
/*
//otra forma de hacerlo (visto en clase seria):
ArrayList<Integer> obtenerListaPar = new ArrayList<>();
ArrayList<Integer> ListaPar = new ArrayList<>();
int numero = 0;
for(int i=0; i<10; i++){
numero++;
obtenerListaPar.add(numero);
}
obtenerListaPar.stream()
.filter((x)->(x%2==0))
.forEach((x)->{ListaPar.add(x);})
system.out.println(ListaPar);
*/
}
