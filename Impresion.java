public class Impresion extends Producto {
    private String color;
    private Foto[] fotos;
    private int cantidadFotos;

    public Impresion(int numero, String color, int maxFotos) {
        super(numero);
        this.color = color;
        this.fotos = new Foto[maxFotos]; // tamaño máximo definido al crearla
        this.cantidadFotos = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void addFoto(Foto foto) {
        if (cantidadFotos < fotos.length) {
            fotos[cantidadFotos] = foto;
            cantidadFotos++;
        } else {
            System.out.println("No se pueden agregar más fotos a esta impresión.");
        }
    }

    @Override
    public String informacion() {
        return "Impresión número " + getNumero() + " - Color: " + color + " (" + cantidadFotos + " fotos)";
    }

    public void printFotos() {
        System.out.println("Fotos de la impresión:");
        for (int i = 0; i < cantidadFotos; i++) {
            fotos[i].print();
        }
    }
}
