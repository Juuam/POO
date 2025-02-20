
public class veiculo{
     String prefixo;
     String chassi;
     int qtdGiros;
     float quilometragem;
     int ano;

    public void ligarOnibus(String prefixo){
        System.out.println("Ônibus ligado prefixo " + prefixo);
    }
    public void passarCatraca(int qtdGiros){
        System.out.println("Passando na catraca "+ qtdGiros);
    }
    public void consertarOnibus(){
        System.out.println("Ônibus em manutenção");
    }
}