public class Main {
    public static void main(String[] args) {
        Festividad feriaSevilla = new Festividad("La Feria de Sevilla", "abril");
        Poblacionimpl sevilla = new Poblacionimpl("Sevilla", 1942389, 14036, 900000, 1300000, feriaSevilla);

        System.out.println(sevilla);
        System.out.println(feriaSevilla);
        System.out.println("Porcentaje de desempleo: " + String.format("%.2f", sevilla.getPorcentajeDesempleo()) + "%");
    }


}