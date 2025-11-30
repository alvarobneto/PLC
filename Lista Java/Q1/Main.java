public class Main {
    public static void main(String[] args) {

        Viagem onibus = new Onibus("Salvador", 900, 0);
        Viagem aviao  = new Aviao("Salvador", 900, 0);
        Viagem carro  = new Carro("Salvador", 900, 0);

        imprimirViagem("Ônibus", onibus);
        imprimirViagem("Avião", aviao);
        imprimirViagem("Carro", carro);
    }

    public static void imprimirViagem(String tipo, Viagem v){
        System.out.println("Transporte: " + tipo);
        System.out.println("Destino: " + v.getDestino());
        System.out.printf("Preço da viagem: R$%.2f%n", v.calcularValor());
        System.out.println("Tempo estimado: " + v.tempoDeViagem());
    }
}
