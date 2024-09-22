package Programas;
import java.util.Scanner;

public class Tarea02 {
    public static void main(String[] args) {
        //declarar variables
        double sueldo1, sueldo2, sueldo3, sueldo4, sueldo5, st, p;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Sueldo1 :");
        sueldo1 = lectura.nextDouble();
        System.out.print("Sueldo2 :");
        sueldo2 = lectura.nextDouble();
        System.out.print("Sueldo3 :");
        sueldo3 = lectura.nextDouble();
        System.out.print("Sueldo4 :");
        sueldo4 = lectura.nextDouble();
        System.out.print("Sueldo5 :");
        sueldo5 = lectura.nextDouble();
        //proceso de datos
        st = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;
        p = (sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5) / 5;
        //salida de datos
        System.out.println("Total de sueldo: " + st);
        System.out.println("Promedio de sueldo: " + p);
    }
}