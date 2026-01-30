public class AssinaturaEmpresarial extends Assinatura{

    public AssinaturaEmpresarial() {
        super(99.90, TipoAssinatura.EMPRESARIAL);
    }

    @Override
    public double calcularDesconto() {
        return getValor() * 0.05;
    }

    @Override
    public double calcularTaxa() {
        return 15;
    }

}
