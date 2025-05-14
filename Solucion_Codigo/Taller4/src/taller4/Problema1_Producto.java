package taller4;

class Producto {
    //Declaraciond de los atributos
    public int cantidadProducto;
    public double precioProducto;
    public double descuento;
    public double montoDescuento;
    public double precioFinal;

    public Producto() {
    }

    public Producto(int cantidadProducto, double precioProducto) {
        this.cantidadProducto = cantidadProducto;
        this.precioProducto = precioProducto;
    }

    public double calcularDescuento(double precioProducto, int cantidadProducto) {
        if (this.precioProducto >= 1000 && this.cantidadProducto >= 10) {
            this.descuento = 10;
        } else if (this.precioProducto < 1000) {
            this.descuento = 5;
        }
        this.montoDescuento = (this.cantidadProducto * this.precioProducto) * (this.descuento / 100);
        return this.descuento;
    }

    public double calcularPrecioFinal() {
        this.precioFinal = (this.cantidadProducto * this.precioProducto) - this.montoDescuento;
        return this.precioFinal;
    }
    
    @Override
    public String toString() {
        return "\nProducto{" 
                + "\nCantidad del producto: " + cantidadProducto 
                + "\nPrecio del producto: " + precioProducto 
                + "\nDescuento aplicado: " + descuento +" %" 
                + "\nDescuento:" + montoDescuento 
                + "\nPrecio final: " + precioFinal + "}\n";
    }
}
