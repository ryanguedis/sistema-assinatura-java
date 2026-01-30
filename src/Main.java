public class Main {
    public static void main(String[] args) {

        Assinatura[] assinaturas = new Assinatura[3];

        AssinaturaBasica assBasica = new AssinaturaBasica();
        AssinaturaPremium assPremium = new AssinaturaPremium();
        AssinaturaEmpresarial assEmpresarial = new AssinaturaEmpresarial();

        assinaturas[0] = assBasica;
        assinaturas[1] = assPremium;
        assinaturas[2] = assEmpresarial;

        for (int i = 0; i < assinaturas.length; i++) {
            System.out.println("TIPO: " + assinaturas[i].getTipo());
            System.out.println("VALOR BASE: " + assinaturas[i].getValor());
            System.out.println("VALOR FINAL: " + assinaturas[i].calcularValorFinal());
            System.out.println("--------------------");
        }

    }
}
