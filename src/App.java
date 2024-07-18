
public class App {
    public static void main(String[] args) throws Exception {
        TabelaHash th = new TabelaHash(5);
        Aluno a1 = new Aluno(32, "Ana");
        Aluno a2 = new Aluno(36, "Tereza");
        Aluno a3 = new Aluno(31, "Bianca");
        Aluno a4 = new Aluno(30, "Rafael");
        Aluno a5 = new Aluno(35, "Pedro");
        th.inserirValor(a1);
        th.inserirValor(a2);
        th.inserirValor(a3);
        th.inserirValor(a4);
        th.inserirValor(a5);
        System.out.println(th);
    }
}
