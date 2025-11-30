public class Carro extends Viagem {

  public Carro(String destino, double distanciaEmKm, double precoBase) {
      super(destino, distanciaEmKm, precoBase);
  }  

  @Override
  public double calcularValor(){
    return getDistanciaEmKm() * 0.5;
  }

  @Override
  public String tempoDeViagem() {
      int tempo = (int)getDistanciaEmKm() / 100;
      return String.valueOf(tempo);
  }
}
