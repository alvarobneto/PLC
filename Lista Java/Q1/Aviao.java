public class Aviao extends Viagem {

  public Aviao(String destino, double distanciaEmKm, double precoBase) {
      super(destino, distanciaEmKm, precoBase);
  }  

  @Override
  public double calcularValor(){
    return getDistanciaEmKm() * 1;
  }

  @Override
  public String tempoDeViagem(){
    double tempo = getDistanciaEmKm()/800;
    return String.format("%.1f", tempo);
  }
}