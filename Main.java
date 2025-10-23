import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("123456789", "Luis Pérez");

        Camara camara = new Camara.Builder()
            .numero(1)
            .marca("Canon")
            .modelo("EOS R5")
            .build();

        Impresion impresion = new Impresion.Builder()
            .numero(2)
            .color("Color")
            .agregarFoto(new Foto("foto1.jpg"))
            .agregarFoto(new Foto("foto2.jpg"))
            .build();

        Pedido pedido = new Pedido.Builder()
            .cliente(cliente)
            .fecha(new Date())
            .numeroTarjetaCredito(987654)
            .agregarProducto(camara)
            .agregarProducto(impresion)
            .build();

        pedido.resumenPedido();
    }
}
