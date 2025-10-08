public abstract class Producto {
    private int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Método abstracto que las clases hijas deben implementar
    public abstract String informacion();
}
