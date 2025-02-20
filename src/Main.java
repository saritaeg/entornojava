public class Main {
    public static void main(String[] args) {
        //Constructor
        //nombreInterface nombre= new nombreClase();
        punto p = new puntoimpl(1,2);
        System.out.println("La coordenada x vale:" + p.getX());
        p.setX(44);
        System.out.println("La coordenada x vale:" + p.getX());
        System.out.println(p);
    }
}