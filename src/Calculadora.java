public class Calculadora {
    private String marca;
    private boolean EsCientifica;
    private double primerValor;
    private double segundoValor;

    public Calculadora(String marca, boolean esCientifica) {
        this.marca = marca;
        EsCientifica = esCientifica;
    }

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

    public double sumar() {
        return primerValor + segundoValor;
    }

    public double restar() {
        return primerValor - segundoValor;
    }

    public double multiplicar() {
        return primerValor * segundoValor;
    }

    public double dividir() {
        if (segundoValor != 0) {
            return primerValor / segundoValor;
        } else {
            return 0.0;
        }
    }




    public String elevarAPotencia() {
        if (EsCientifica == true) {

            return " " + (Math.pow(primerValor, segundoValor));
        } else {
           return "Su calculadora no es científica, no puede realizar esta operación";

        }
    }

    @Override
    public String toString() {
        return "La calculadora es de marca"+"["+ marca + "]" +
               "y" + EsCientifica +"cientifica";
}
}
// "La calculadora es de marca
// [concatenar marca] y [es/no es (dependiendo del valor booleano)] científica".