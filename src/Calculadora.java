public class Calculadora {
    private String marca;
    private boolean EsCientifica;
    private double primerValor;
    private double segundoValor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEsCientifica() {
        return EsCientifica;
    }

    public void setEsCientifica(boolean esCientifica) {
        EsCientifica = esCientifica;
    }

    public double getPrimerValor() {
        return primerValor;
    }

    public void setPrimerValor(double primerValor) {
        this.primerValor = primerValor;
    }

    public double getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(double segundoValor) {
        this.segundoValor = segundoValor;
    }
}
