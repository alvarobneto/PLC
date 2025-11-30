public class JogadorATP {
    
    private double pontos;
    private String nome;

    public JogadorATP(double pontos, String nome){
        this.pontos = pontos;
        this.nome = nome;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public synchronized void adionarPontos(double valor){
        setPontos(valor + getPontos());
        System.out.println("Total: " + getPontos());
        System.out.println("Método executado pela thread: " + Thread.currentThread().getName());
    }

    public synchronized void removerPontos(double valor) throws PontosInsuficientesException{
        if(valor < getPontos()) {
            setPontos(getPontos() - valor);
            System.out.println("Total: " + getPontos());
        }
        else throw new PontosInsuficientesException("Tentativa de remover " + valor + " pontos, mas o jogador tem apenas " + getPontos());
        System.out.println("Método executado pela thread: " + Thread.currentThread().getName());
    }
}
