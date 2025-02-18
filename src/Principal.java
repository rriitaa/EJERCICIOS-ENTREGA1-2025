public class Principal {
    public static void main(String[] args) {
        
        // Pruebas de los métodos en Iterativo.java
        System.out.println("Suma iterativa de 5: " + Iterativo.suma(5));
        System.out.println("Factorial iterativo de 5: " + Iterativo.factorial(5));

        // Pruebas de los métodos en Recursivo.java
        int[] lista = {1, 2, 3, 4, 5, 6};
        System.out.println("Suma de pares recursiva en lista: " + Recursivo.sumaListaPares(lista, 0));
    }
}
