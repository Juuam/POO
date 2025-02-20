
public class Principal{
    public static void main(String[] args){
    veiculo busao = new veiculo();
    veiculo busao2 = new veiculo();

    busao.prefixo = "31126";
    busao.chassi = "124JK45";
    busao.qtdGiros = 4576;
    busao.quilometragem = 137463;
    busao.ano = 2014;

    busao2.prefixo = "31177";
    busao2.chassi = "I45NTI42";
    busao2.qtdGiros = 8472;
    busao2.quilometragem = 184663;
    busao2.ano = 2016;

    System.out.println("Ônibus 1:");
        busao.ligarOnibus(busao.prefixo);
        busao.passarCatraca(busao.qtdGiros);
        busao.consertarOnibus();

    System.out.println("Ônibus 1:");
        busao2.ligarOnibus(busao.prefixo);
        busao2.passarCatraca(busao.qtdGiros);
        busao2.consertarOnibus();
    }
}