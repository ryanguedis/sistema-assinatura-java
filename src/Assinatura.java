public abstract class Assinatura {

    private double valor;
    private TipoAssinatura tipo;

    public Assinatura(double valor, TipoAssinatura tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public TipoAssinatura getTipo() {
        return tipo;
    }

    public final double calcularValorFinal() {
        return getValor() - calcularDesconto() + calcularTaxa();
    }

    public double calcularDesconto() {
        return 0;
    }

    public double calcularTaxa() {
        return 0;
    }

}
