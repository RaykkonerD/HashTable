public class ListaSEncadeada {
	private Nodo head;
	private Nodo tail;
	private int count;

	public ListaSEncadeada(){
		this.head = new Nodo(null);
		this.tail = new Nodo(null);
		this.count = 0;
	}

	public int size(){
		return this.count;
	}

	public void add(Aluno value){
		Nodo newNode = new Nodo(value);

		if(this.count == 0){
			this.head.setNext(newNode);
			this.tail.setNext(newNode);
		} else {
			this.tail.getNext().setNext(newNode);
			this.tail.setNext(newNode);
		}

		this.count++;
	}

	public int add(int index, Aluno value){
		if(index == 0){
			Nodo newNode = new Nodo(value);
			this.head.setNext(newNode);
			this.tail.setNext(newNode);
			this.count++;
			return 0;
		} else if(index > 0 && index <= this.count){
			Nodo nodo = this.head.getNext();

		  for(int i = 0; i < index - 1; i++){
			  nodo = nodo.getNext();
		  }

			Nodo newNode = new Nodo(value);
			Nodo nextNode = nodo.getNext();
		  nodo.setNext(newNode);
			newNode.setNext(nextNode);

			if(index == this.count){
				this.tail.setNext(newNode);
			}
			
			this.count++;
			return 0;
		} else {
			return -1;
		}
	}

	public Nodo get(int index){
		if(index >= 0 && index < this.count){
			Nodo nodo = this.head;
		  for(int i = 0; i <= index; i++){
			  nodo = nodo.getNext();
		  }
		  return nodo;
		} else {
			return null;
		}
	}

	public Aluno getAluno(int matricula){
		if(this.head == null){
			return null;
		}

		Nodo item = this.head;

		while(item != null && item.getValue().getMatricula() != matricula){
			item = item.getNext();
		}
		

		return item;
	}

	public Aluno remove(int index){
		if(index >= 0 && index < this.count){
			Nodo nodo = this.head;
		  for(int i = 0; i < index - 1; i++){
			  nodo = nodo.getNext();
		  }
			Nodo nextNode = nodo.getNext();
			nodo.setNext(nextNode.getNext());
			this.count--;
		  return nextNode.getValue();
		} else {
			return null;
		}
	}

	public Nodo getHead(){
		return this.head;
	}

	public Nodo getTail(){
		return this.tail;
	}
}