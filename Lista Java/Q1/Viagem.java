public class Viagem implements Transporte {

    private String destino;
    private double distanciaEmKm;
    private double precoBase;

    public Viagem(String destino, double distanciaEmKm, double precoBase) {
        this.destino = destino;
        this.distanciaEmKm = distanciaEmKm;
        this.precoBase = precoBase;
    }

    public double calcularValor() {
        return precoBase;
    }

    public String tempoDeViagem() {
        return "Tempo desconhecido";
    }

    public double getDistanciaEmKm() {
        return distanciaEmKm;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public void setDistanciaEmKm(double distanciaEmKm) {
        this.distanciaEmKm = distanciaEmKm;
    }
}
