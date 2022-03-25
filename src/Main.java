
public class Main {
    public static void main(String[] args) {
        Calculadora basica = new Calculadora("Patito",false);
        Calculadora cientifica= new Calculadora("casio",true);

        basica.getPrimerValor();
        basica.getSegundoValor();
        cientifica.getPrimerValor();
        cientifica.getSegundoValor();

        basica.sumar();
        basica.restar();
        basica.multiplicar();
        basica.dividir();
        basica.elevarAPotencia();

        cientifica.sumar();
        cientifica.restar();
        cientifica.multiplicar();
        cientifica.dividir();
        cientifica.elevarAPotencia();

        System.out.println("Calculadora Basica:");
        System.out.println("Suma de" );
    }
}
