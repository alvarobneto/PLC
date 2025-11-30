public class Onibus extends Viagem {

    public Onibus(String destino, double distanciaEmKm, double precoBase) {
        super(destino, distanciaEmKm, precoBase);
    }   
    
    @Override 
    public double calcularValor(){
        return getDistanciaEmKm() * 0.3;
    }

    @Override 
    public String tempoDeViagem() {
        int tempo = (int)(getDistanciaEmKm() / 80);
        return String.valueOf(tempo);
    }
}