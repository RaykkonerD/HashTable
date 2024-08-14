
public class App {
    public static void main(String[] args) throws Exception {
        // TabelaHash usando lista encadeada
        // TabelaHash th = new TabelaHash(5);
        // Aluno a1 = new Aluno(32, "Ana");
        // Aluno a2 = new Aluno(36, "Tereza");
        // Aluno a3 = new Aluno(31, "Bianca");
        // Aluno a4 = new Aluno(30, "Rafael");
        // Aluno a5 = new Aluno(35, "Pedro");
        // th.inserirValor(a1);
        // th.inserirValor(a2);
        // th.inserirValor(a3);
        // th.inserirValor(a4);
        // th.inserirValor(a5);
        // System.out.println("=================== TabelaHash 1 ===================");
        // System.out.println("------ Lista ------");
        // System.out.println(th);
        // System.out.println("-------------------\n");

        // System.out.println("30 é " + th.pegarValor(30));
        // System.out.println("31 é " + th.pegarValor(31));
        // System.out.println("32 é " + th.pegarValor(32));

        // System.out.println();
        // System.out.println("Aluno " + th.retirarValor(36) + " removido.");
        // System.out.println("Aluno " + th.retirarValor(35) + " removido.");
        // System.out.println();

        // System.out.println("------ Lista ------");
        // System.out.println(th);
        // System.out.println("-------------------\n");


        // TabelaHash sem usar lista encadeada
        TabelaHash2 th2 = new TabelaHash2(5);
        Aluno a1_2 = new Aluno(32, "Ana");
        Aluno a2_2 = new Aluno(36, "Tereza");
        Aluno a3_2 = new Aluno(31, "Bianca");
        Aluno a4_2 = new Aluno(30, "Rafael");
        Aluno a5_2 = new Aluno(35, "Pedro");
        Aluno a6_2 = new Aluno(40, "Florentina");
        th2.inserirValor(a1_2);
        th2.inserirValor(a2_2);
        th2.inserirValor(a3_2);
        th2.inserirValor(a4_2);
        th2.inserirValor(a5_2);
        th2.inserirValor(a6_2);
        System.out.println("=================== TabelaHash 2 ===================");
        System.out.println("------ Lista ------");
        System.out.print(th2);
        System.out.println("-------------------\n");

        System.out.println("30 é " + th2.pegarValor(30));
        System.out.println("31 é " + th2.pegarValor(31));
        System.out.println("32 é " + th2.pegarValor(32));
        System.out.println("40 é " + th2.pegarValor(40));

        System.out.println();
        th2.retirarValor(31);
        th2.retirarValor(35);
        System.out.println("Bianca removida");
        System.out.println("Pedro removido");
        System.out.println();

        System.out.println("------ Lista ------");
        System.out.print(th2);
        System.out.println("-------------------\n");
    }
}
