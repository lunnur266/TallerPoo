public class Impresion extends Producto {

    private String color;
    private Foto[] fotos;
    private int cantidadFotos;

    private Impresion(Builder builder) {
        super(builder.numero);
        this.color = builder.color;
        this.fotos = builder.fotos;
        this.cantidadFotos = builder.cantidadFotos;
    }

    public static class Builder {
        private int numero;
        private String color;
        private Foto[] fotos = new Foto[10];
        private int cantidadFotos = 0;

        public Builder numero(int numero) {
            this.numero = numero;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder agregarFoto(Foto foto) {
            if (cantidadFotos < fotos.length) {
                fotos[cantidadFotos++] = foto;
            }
            return this;
        }

        public Impresion build() {
            return new Impresion(this);
        }
    }

    @Override
    public String informacion() {
        return "Impresión número " + getNumero() + " - Color: " + color + " (" + cantidadFotos + " fotos)";
    }
}
