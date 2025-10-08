import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private int cantidadProductos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Date fecha, int numeroTarjetaCredito, int maxProductos) {
        this.cliente = cliente;
        this.productos = new Producto[maxProductos];
        this.cantidadProductos = 0;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void addProducto(Producto p) {
        if (cantidadProductos < productos.length) {
            productos[cantidadProductos] = p;
            cantidadProductos++;
        } else {
            System.out.println("No se pueden agregar más productos al pedido.");
        }
    }

    public void resumenPedido() {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Cédula: " + cliente.getCedula());
        System.out.println("Fecha: " + fecha);
        System.out.println("Número de tarjeta: " + numeroTarjetaCredito);
        System.out.println("Productos en el pedido:");

        for (int i = 0; i < cantidadProductos; i++) {
            Producto p = productos[i];
            System.out.println(" - " + p.informacion());
            if (p instanceof Impresion) {
                ((Impresion) p).printFotos();
            }
        }
    }
}
