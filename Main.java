import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("123456789", "Luis Pérez");

        // Uso de polimorfismo: variables del tipo padre Producto
        Producto camara = new Camara(1, "Canon", "EOS R5");
        Producto impresion = new Impresion(2, "Color", 3);

        // Para acceder a métodos propios de Impresion, se hace un cast (el cast lo que hace es decirle que aunque el objeto es declardo como producto en realidad es impresion asi que llama y usa los metodos de la clase hija)
        ((Impresion) impresion).addFoto(new Foto("foto1.jpg"));
        ((Impresion) impresion).addFoto(new Foto("foto2.jpg"));

        // Crear pedido (composición: Pedido contiene Cliente y Productos)
        Pedido pedido = new Pedido(cliente, new Date(), 987654, 5);
        pedido.addProducto(camara);
        pedido.addProducto(impresion);

        // Mostrar resumen del pedido
        pedido.resumenPedido();
    }
}
