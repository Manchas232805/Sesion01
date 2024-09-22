package Programas;
import java.util.Scanner;

public class Tarea03 {
    public static void main(String[] args) {
        //declarar variables
        String empleado, cargo;
        int ingreso, gastoM, ahorroM, ahorroB, ahorroS, ahorroA;
        Scanner lectura = new Scanner(System.in);
        //Ingreso de datos
        System.out.println("Nombre del empleado ");
        empleado = lectura.nextLine();
        System.out.println("cargo del empleado: ");
        cargo = lectura.nextLine();
        System.out.println("Ingresos del empleado: ");
        ingreso = lectura.nextInt();
        System.out.println("Gasto mensual: ");
        gastoM = lectura.nextInt();
        //proceso de datos
        ahorroM = ingreso - gastoM;
        ahorroB = (ingreso - gastoM)* 2;
        ahorroS = (ingreso - gastoM)* 6;
        ahorroA = (ingreso - gastoM)* 12;
        //salida de datos
        System.out.println("El ahorro mensual es: " + ahorroM);
        System.out.println("El ahorro bimestral es: " + ahorroB);
        System.out.println("El ahorro semestral es: " + ahorroS);
        System.out.println("El ahorro anual es: " + ahorroA);
    }
}