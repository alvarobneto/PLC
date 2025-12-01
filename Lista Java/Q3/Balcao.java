public class Balcao {

    private String nome;
    private int capacidade;
    private int fila;
    
    public Balcao(String nome, int capacidade, int fila){
        this.nome = nome;
        this.capacidade = capacidade;
        this.fila = fila;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getFila() {
        return capacidade;
    }

    public void setFila(int capacidade) {
        this.capacidade = capacidade;
    }

    public synchronized void colocar(Ingrediente ingrediente) throws InterruptedException {
        
        setCapacidade(capacidade - 1); 
        if(getCapacidade() > 0) setFila(fila - 1);
        else fila++;

        notifyAll(); 
    }

    public synchronized void retirar() throws InterruptedException {
        
        while(getCapacidade() == 10) wait(); //bancada vazia 
        setCapacidade(capacidade + 1); 
        if(fila > 0) {
            fila--;
            setCapacidade(capacidade - 1); 
        }
        notifyAll(); 
    }

}
