public class ClasePrincipal {
    public static void main(String[] args) {
        String cadena = "a";
        System.out.println(cadena);
        do{
            cadena = cadena +"e";
        }while(cadena.length()<5);
        System.out.println(cadena);
        do{
            cadena = cadena + "i";
        }while(cadena.length()<3);
        System.out.println(cadena);
    }
}

/*Para depurar el codigo de la clase ClasePrincipal,
primero voy a colocar el punto de rotura en las lineas que creo que puede haber fallo,
como cuando imprime cadena y tambien dentro de los bucles do while. Luego ejecuto el programa en modo depuracion(boton del bichito),
lo que detiene la ejecucion en cada punto de rotura que he puesto, con esto puedo analizar
los valores de cadena en la pestaña variables o tambien pasando el cursor sobre la variable.
Durante la ejecucion cadena comienza con una 'a', y en el primer do while se le añade 'e'
hasta 4 ya que la condicion es la longitud de la cadena <5, imprimiendose 'aeeee'. En el segundo while, a 'aeeee' se le
añade 'i' hasta llegar a 'aeeeei' que con esto termina el bucle.
La depuracion nos ha ayudado a poder observar los cambios que hace paso a paso el codigo para podrr entenderlo facilmente
y asegurarnos que todos los bucles funcionan correctamente.
*/