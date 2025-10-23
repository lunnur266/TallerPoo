public class Camara extends Producto {

    private String marca;
    private String modelo;

    private Camara(Builder builder) {
        super(builder.numero);
        this.marca = builder.marca;
        this.modelo = builder.modelo;
    }

    public static class Builder {
        private int numero;
        private String marca;
        private String modelo;

        public Builder numero(int numero) {
            this.numero = numero;
            return this;
        }

        public Builder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Camara build() {
            return new Camara(this);
        }
    }

    @Override
    public String informacion() {
        return "Cámara número " + getNumero() + " - Marca: " + marca + " - Modelo: " + modelo;
    }
}
