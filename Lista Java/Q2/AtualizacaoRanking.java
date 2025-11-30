public class AtualizacaoRanking extends Thread {

    private JogadorATP jogador;
    private boolean ehGanho;
    private double valor;

    public AtualizacaoRanking(JogadorATP jogador, boolean ehGanho, double valor) {
        this.jogador = jogador;
        this.ehGanho = ehGanho;
        this.valor = valor;
    }

    @Override
    public void run() {
        if (ehGanho) jogador.adionarPontos(valor);
        else {
            try {
                jogador.removerPontos(valor);
            } 
            catch (PontosInsuficientesException e) {
                System.out.println("Exceção capturada na thread " + Thread.currentThread().getName());
                System.out.println(e.getMessage());
            }
        }
}

}
