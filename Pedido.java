import java.util.Date;

public class Pedido {

    private Cliente cliente;
    private Producto[] productos;
    private int cantidadProductos;
    private Date fecha;
    private int numeroTarjetaCredito;

    private Pedido(Builder builder) {
        this.cliente = builder.cliente;
        this.productos = builder.productos;
        this.cantidadProductos = builder.cantidadProductos;
        this.fecha = builder.fecha;
        this.numeroTarjetaCredito = builder.numeroTarjetaCredito;
    }

    public static class Builder {
        private Cliente cliente;
        private Producto[] productos = new Producto[5];
        private int cantidadProductos = 0;
        private Date fecha;
        private int numeroTarjetaCredito;

        public Builder cliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder fecha(Date fecha) {
            this.fecha = fecha;
            return this;
        }

        public Builder numeroTarjetaCredito(int numero) {
            this.numeroTarjetaCredito = numero;
            return this;
        }

        public Builder agregarProducto(Producto p) {
            if (cantidadProductos < productos.length) {
                productos[cantidadProductos++] = p;
            }
            return this;
        }

        public Pedido build() {
            return new Pedido(this);
        }
    }

    public void resumenPedido() {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Cédula: " + cliente.getCedula());
        System.out.println("Fecha: " + fecha);
        System.out.println("Número de tarjeta: " + numeroTarjetaCredito);
        System.out.println("Productos en el pedido:");
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println(" - " + productos[i].informacion());
        }
    }
}

