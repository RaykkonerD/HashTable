public class ListaSEncadeada {
    private Nodo head;
    private Nodo tail;
    private int size;

    public ListaSEncadeada() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void add(Aluno value) {
        Nodo novoNodo = new Nodo(value);

        if (this.size == 0) {
            this.head = novoNodo;
            this.tail = novoNodo;
        } else {
            this.tail.setNext(novoNodo);
            novoNodo.setPrevious(this.tail);
            this.tail = novoNodo;
        }

        this.size++;
    }

    public int add(int index, Aluno value) {
        if (index == 0) {
            Nodo novoNodo = new Nodo(value);
            novoNodo.setNext(this.head);
            this.head = novoNodo;
            
            if (this.size == 0) {
                this.tail = novoNodo;
            }

            this.size++;
            return 0;
        } else if (index > 0 && index <= this.size) {
            Nodo atual = this.head;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.getNext();
            }

            Nodo novoNodo = new Nodo(value);
            novoNodo.setNext(atual.getNext());
            atual.setNext(novoNodo);

            if (index == this.size) {
                this.tail = novoNodo;
            }

            this.size++;
            return 0;
        } else {
            return -1;
        }
    }

    public Nodo get(int index) {
        if (index >= 0 && index < this.size) {
            Nodo atual = this.head;
            for (int i = 0; i < index; i++) {
                atual = atual.getNext();
            }
            return atual;
        } else {
            return null;
        }
    }

    public Aluno getAluno(int matricula) {
        Nodo atual = this.head;
        while (atual != null) {
            Aluno aluno = atual.getValue();
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
            atual = atual.getNext();
        }
        return null;
    }

    public Aluno removeAluno(Aluno alunoARemover) {
        Nodo atual = this.head;
        int size = 0;

        while (atual != null) {
            Aluno esseAluno = atual.getValue();
            if (esseAluno.getMatricula() == alunoARemover.getMatricula()) {
                return remove(size);
            }
            atual = atual.getNext();
            size++;
        }
        return null;
    }

    public Aluno remove(int index) {
        if (index >= 0 && index < this.size) {
            Nodo removedNode = null;

            if (index == 0) {
                removedNode = this.head;
                this.head = this.head.getNext();
                this.head.setPrevious(null);

                if (this.size == 1) {
                    this.tail = null;
                }
            } else {
                Nodo previousNode = this.head;
                for (int i = 0; i < index - 1; i++) {
                    previousNode = previousNode.getNext();
                }
                removedNode = previousNode.getNext();
                previousNode.setNext(removedNode.getNext());
                if (index == this.size - 1) {
                    this.tail = previousNode;
                }
            }

            this.size--;
            return removedNode.getValue();
        } else {
            return null;
        }
    }

    public Nodo getHead() {
        return this.head;
    }

    public Nodo getTail() {
        return this.tail;
    }
}
