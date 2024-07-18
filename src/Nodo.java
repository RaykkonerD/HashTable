public class Nodo {
	private Nodo next;
	private Nodo previous;
	private Aluno value;

	public Nodo(Aluno value){
		this.value = value;
	}

	public Nodo getNext(){
		return this.next;
	}

	public void setNext(Nodo next){
		this.next = next;
	}

	public Nodo getPrevious(){
		return this.previous;
	}

	public void setPrevious(Nodo previous){
		this.previous = previous;
	}

	public Aluno getValue(){
		return this.value;
	}

	public void setValue(Aluno value){
		this.value = value;
	}
}