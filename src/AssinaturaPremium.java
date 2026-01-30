public class AssinaturaPremium extends Assinatura{

    public AssinaturaPremium() {
        super(59.90, TipoAssinatura.PREMIUM);
    }

    @Override
    public double calcularDesconto() {
        return getValor() * 0.1;
    }
}
