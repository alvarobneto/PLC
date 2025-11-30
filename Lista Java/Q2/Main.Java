public class Main {
    public static void main(String[] args) {

        JogadorATP jogador = new JogadorATP(100, "Bruno");

        System.out.println("=== TESTE 1: Ganhos concorrentes ===");
        Thread g1 = new AtualizacaoRanking(jogador, true, 30);
        Thread g2 = new AtualizacaoRanking(jogador, true, 20);
        Thread g3 = new AtualizacaoRanking(jogador, true, 10);

        g1.start();
        g2.start();
        g3.start();

        esperar(g1, g2, g3); // aguarda todas as threads acabarem


        System.out.println("\n=== TESTE 2: Perdas concorrentes ===");
        Thread p1 = new AtualizacaoRanking(jogador, false, 15);
        Thread p2 = new AtualizacaoRanking(jogador, false, 10);
        Thread p3 = new AtualizacaoRanking(jogador, false, 5);

        p1.start();
        p2.start();
        p3.start();

        esperar(p1, p2, p3);


        System.out.println("\n=== TESTE 3: Tentativa de perder pontos além do limite ===");
        Thread perdaExcessiva = new AtualizacaoRanking(jogador, false, 999);
        perdaExcessiva.start();

        esperar(perdaExcessiva);


        System.out.println("\n=== TESTE 4: 5 ganhos e 5 perdas simultâneos ===");
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 5; i++) {
            threads[i] = new AtualizacaoRanking(jogador, true, 10);
        }
        for (int i = 5; i < 10; i++) {
            threads[i] = new AtualizacaoRanking(jogador, false, 8);
        }

        for (Thread t : threads) t.start();
        esperar(threads);

        System.out.println("\n=== RANKING ===");
        System.out.println("Jogador: " + jogador.getNome());
        System.out.println("Pontos finais: " + jogador.getPontos());
    }

    // Método auxiliar para esperar várias threads terminarem
    private static void esperar(Thread... threads) {
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
