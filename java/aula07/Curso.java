public class Curso {

    private String codigo;
    public String nome;

    public Curso(String codigoInicial, String nomeInicial) {
        codigo = codigoInicial;
        nome = nomeInicial;
    }

    public void setCodigo(String novoCod){
        codigo = novoCod;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }
}
