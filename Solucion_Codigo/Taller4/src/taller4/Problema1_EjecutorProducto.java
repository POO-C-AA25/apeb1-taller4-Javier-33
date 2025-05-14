package taller4;

import java.util.Scanner;

public class Problema1_EjecutorProducto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variables para insercion de datos
        int cantidad;
        double precio;
        
        //Solicitud de los datos en el metodo main
        System.out.print("Dime la cantidad de producto que deseas: ");
        cantidad = teclado.nextInt();
        System.out.print("Dime el precio por producto: ");
        precio = teclado.nextInt();
        
        //Generacion y impresion de los datos del primer objeto
        Producto  producto1 = new Producto(cantidad, precio);
            producto1.calcularDescuento(precio, cantidad);
            producto1.calcularPrecioFinal();
            System.out.print(producto1.toString());
        
        //Generacion y impresion de los datos del segundo objeto
        Producto producto2 = new Producto(10, 10.0);
            producto2.calcularDescuento(precio, cantidad);
            producto2.calcularPrecioFinal();
            System.out.print(producto2.toString());
    }
}
