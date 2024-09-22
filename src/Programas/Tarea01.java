package Programas;
import java.util.Scanner;

public class Tarea01 {
    public static void main(String[] args) {
        //declarar variables
        String cliente, producto;
        double precio, subtotal, igv, totalP;
        int cantidad;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Nombre del cliente: ");
        cliente = lectura.next();
        System.out.print("Producto: ");
        producto = lectura.next();
        System.out.print("Precio: ");
        precio = lectura.nextDouble();
        System.out.print("Cantidad: ");
        cantidad = lectura.nextInt();
        //proceso de datos
        subtotal = precio * cantidad;
        igv = subtotal * 0.18;
        totalP = subtotal - igv;
        //salida de datos
        System.out.println("El subtotal es: " + subtotal);
        System.out.println("El subtotal es: " + igv);
        System.out.println("El subtotal es: " + totalP);
    }
}