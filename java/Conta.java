public class Conta{
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo){
        this.numero = Conta.getProximo();
        this.saldo = saldo;
    }

    public void creditar(double valor){
        saldo = saldo + valor;
    }
    //EX: Conta c = new Conta;
    //c.creditar(3.30);

    public void debitar(double valor){
        saldo = saldo - valor;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getNum(){
        return numero;
    }

    private static int getProximo(){
        proximo = proximo + 1;
        return proximo;
    }
}
