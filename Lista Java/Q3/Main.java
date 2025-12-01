public class Main {
    public static void main(String[] args) {

        System.out.println("=== CASO 1: Balcão com pouco espaço ===");
        Balcao balcaoPequeno = new Balcao("Pequeno", 2, 5);

        new Thread(new Aprendiz(balcaoPequeno, 3), "Aprendiz-1").start();
        new Thread(new Chefe(balcaoPequeno, 1), "Chefe-1").start();

        sleep(5000);

        System.out.println("\n=== CASO 2: Produção muito maior que consumo ===");
        Balcao balcaoProdRapida = new Balcao("ProdRapida", 10, 3);

        new Thread(new Aprendiz(balcaoProdRapida, 5), "Aprendiz-2").start();
        new Thread(new Chefe(balcaoProdRapida, 1), "Chefe-2").start();

        sleep(5000);

        System.out.println("\n=== CASO 3: Consumo muito maior que produção ===");
        Balcao balcaoConsumoRapido = new Balcao("ConsumoRapido", 10, 0);

        new Thread(new Aprendiz(balcaoConsumoRapido, 1), "Aprendiz-3").start();
        new Thread(new Chefe(balcaoConsumoRapido, 5), "Chefe-3").start();
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); }
        catch (Exception e) {}
    }
}
