public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
        imprimirFechaActual();
    }

    public static void imprimirFechaActual() {
        System.out.println("Fecha y hora actual: " + LocalDateTime.now());
    }
}