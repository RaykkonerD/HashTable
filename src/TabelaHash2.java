import java.util.ArrayList;

public class TabelaHash2 {
    private ArrayList<Aluno> lista;
    private int tamanho;

    public TabelaHash2(int tamanho){
        this.lista = new ArrayList<>();
        this.tamanho = tamanho;
        for(int i = 0; i < tamanho; i ++){
            lista.add(null);
        }
    }

    public int funcaoHash(int matricula){
        return matricula % this.tamanho;
    }

	public void setTamanho(int tamanho){
		this.tamanho = tamanho;
	}
	
	public void redimensionar(){
        ArrayList<Aluno> listaAnterior = (ArrayList<Aluno>) this.lista.clone();
		setTamanho(tamanho * 2);
        this.lista.clear();

		for(int i = 0; i < this.tamanho; i++){
			this.lista.add(null);
		}

		int indice = 0;

		while(indice < listaAnterior.size()){
            Aluno aluno = listaAnterior.get(indice);
			if(aluno == null || aluno.getMatricula() == 0){
                //System.out.print((aluno != null ? aluno.getNome() : "null") + " ");
                indice++;
            } else {
				inserirValor(aluno);
			}
		}

        for(Aluno a : lista){
            System.out.print(a.getNome() + " ");
        }
        System.out.println();
	}

    public void inserirValor(Aluno aluno){
        int indice = funcaoHash(aluno.getMatricula());
        Aluno aluno_no_indice = lista.get(indice);

        if(aluno_no_indice == null){
            lista.set(indice, aluno);
        } else {
            while(indice < this.tamanho){
                if(aluno_no_indice == null){
                    lista.set(indice, aluno);
                    return ;
                } else if(indice == this.tamanho - 1){
                    redimensionar();
                    return ;
                } else {
                    indice++;
                    aluno_no_indice = lista.get(indice);
                }
            }
        }
    }

    public String pegarValor(int matricula){
        int indice = funcaoHash(matricula);
        Aluno aluno = lista.get(indice);

        while(aluno != null && aluno.getMatricula() != matricula){
            indice++;
            aluno = lista.get(indice);
        }

        if(aluno != null){
            return aluno.getNome();
        } else {
            return "Aluno não encontrado!";
        }
    }

    @Override
    public String toString(){
       String str = "";

        for(int i = 0; i < this.lista.size(); i++){
            str += "[ " + i + " ]\n";
            
            if(lista.get(i) == null){
                str += "(vazio)\n";
            } else if(lista.get(i).getMatricula() == 0){
                str += "(removido)\n";
            } else {
                str += lista.get(i).getMatricula() + ": " + lista.get(i).getNome() + "\n";
            }
            
            str += "\n";
        }

        return str;
    }
}