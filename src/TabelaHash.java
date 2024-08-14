import java.util.ArrayList;

public class TabelaHash {
    private ArrayList<ListaSEncadeada> lista;
    private int tamanho;

    public TabelaHash(int tamanho){
        this.lista = new ArrayList<>();
        this.tamanho = tamanho;
        for(int i = 0; i < tamanho; i ++){
            lista.add(new ListaSEncadeada());
        }
    }

    public int funcaoHash(int matricula){
        return matricula % this.tamanho;
    }

    public void inserirValor(Aluno aluno){
        int indice = funcaoHash(aluno.getMatricula());
        lista.get(indice).add(aluno);
    }

    public String pegarValor(int matricula){
        int indice = funcaoHash(matricula);
        return lista.get(indice).getAluno(matricula).getNome();
    }

    public String retirarValor(int matricula){
        int indice = funcaoHash(matricula);
        Aluno alunoARemover = lista.get(indice).getAluno(matricula);
        return lista.get(indice).removeAluno(alunoARemover).getNome();
    }

    @Override
    public String toString(){
       String str = "";

        for(ListaSEncadeada l : lista){
            str += "[ " + lista.indexOf(l) + " ]\n";
            for(int i = 0; i < l.size(); i++){
                Nodo previous = l.get(i).getPrevious();
                Nodo next = l.get(i).getNext();
                str += ((previous != null) ? previous.getValue().getNome() : "null") + " <- " + l.get(i).getValue().getNome() + " -> " + ((next != null) ? next.getValue().getNome() : "null") + "\n";
            }
            
            if(lista.indexOf(l) < this.lista.size() - 1){
                str += "\n";
            }
        }
        return str;
    }
}
