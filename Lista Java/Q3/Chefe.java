public class Chefe implements Runnable{

    private Balcao balcao;
    private int desempenho;
    
    public Chefe(Balcao balcao, int desempenho){
        this.balcao = balcao;
        this.desempenho = desempenho;
    }

    public Balcao getBalcao() {
        return balcao;
    }

    public void setBalcao(Balcao balcao) {
        this.balcao = balcao;
    }

    public int getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(int desempenho) {
        this.desempenho = desempenho;
    }

     @Override
    public void run(){
        try {
            while (true) {
                for (int i = 0; i < desempenho; i++) {
                    balcao.retirar();
                    System.out.println(Thread.currentThread().getName() + " consumiu 1 ingrediente");
                }
                Thread.sleep(300);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Chefe interrompido.");
        }
    }
}
