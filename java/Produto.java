public class Produto{
    private String descricao;
    private double valor;
    private int quantidade;

    public void alterarDesc(String novaDesc){
        descricao = novaDesc;
    }

    public String desc(){
        return descricao;
    }

    public void alterarValor(double novoValor){
        valor = novoValor
    }

    public double val(){
        return valor;
    }

    public void alterarQuant(int novaQuant){
        quantidade = novaQuant;
    }

    public int quant(){
        return quantidade;
    }


}
